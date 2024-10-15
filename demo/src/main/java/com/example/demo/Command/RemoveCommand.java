package com.example.demo.Command;

import java.util.Scanner;

import com.example.demo.App.App;

public class RemoveCommand extends BookCommand {
	public RemoveCommand(Scanner scanner, App app) {
		super(scanner, app);
	}

	@Override
	public void execute() {
		System.out.print("削除したい本のタイトルを入力してください: ");
		String title = scanner.nextLine();
		if (app.removeBook(title)) {
			System.out.println("本 '" + title + "' が削除されました");
		} else {
			System.out.println("本 '" + title + "' は見つかりませんでした");
		}
	}
}
