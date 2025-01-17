package com.example.demo.App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.demo.Command.AddCommand;
import com.example.demo.Command.CommandHandler;
import com.example.demo.Command.ExitCommand;
import com.example.demo.Command.FindCommand;
import com.example.demo.Command.ListCommand;
import com.example.demo.Command.RemoveCommand;

public class App {
	private final Scanner scanner;
	private final List<String> books;

	public App() {
		this.scanner = new Scanner(System.in);
		this.books = new ArrayList<>();
	}

	public void start() {
		System.out.println("アプリを利用するならok,やめる場合はqを入力してください");
		String command1 = scanner.nextLine();

		if (command1.equals("ok")) {
			runCommands();
		} else {
			System.out.println("ご利用ありがとうございました");
		}
	}

	private void runCommands() {
		while (true) {
			System.out.println("やりたいことをコマンド(add, remove, find, list, exitの中から入力してください。");
			String command2 = scanner.nextLine();

			CommandHandler commandHandler = getCommandHandler(command2);
			if (commandHandler != null) {
				commandHandler.execute();
				if (commandHandler instanceof ExitCommand) {
					break;
				}
			} else {
				System.out.println("無効な操作です");
			}
		}
		scanner.close();
		System.out.println("ご利用ありがとうございました");
	}

	private CommandHandler getCommandHandler(String command) {
		return switch (command) {
		case "add" -> new AddCommand(scanner, this);
		case "remove" -> new RemoveCommand(scanner, this);
		case "find" -> new FindCommand(this);
		case "list" -> new ListCommand(this);
		case "exit" -> new ExitCommand(scanner);
		default -> null;
		};
	}

	public void addBook(String title) {
		books.add(title);
	}

	public boolean removeBook(String title) {
		return books.remove(title);
	}

	public List<String> getBooks() {
		return new ArrayList<>(books);
	}

	public boolean hasBooks() {
		return !books.isEmpty();
	}
}
