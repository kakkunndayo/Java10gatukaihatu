package com.example.demo.Command;

import java.util.Scanner;

import com.example.demo.App.App;

public class AddCommand extends BookCommand {
	public AddCommand(Scanner scanner, App app) {
		super(scanner, app);
	}

	@Override
	public void execute() {
		System.out.println("本を追加します");
		System.out.print("本のタイトルを入力してください: ");
		String title = scanner.nextLine();
		app.addBook(title);
		System.out.println("本 '" + title + "' が無事に追加されました");
	}
}
