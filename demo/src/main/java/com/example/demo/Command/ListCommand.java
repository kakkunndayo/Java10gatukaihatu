package com.example.demo.Command;

import com.example.demo.App.App;

public class ListCommand extends BookCommand {
	public ListCommand(App app) {
		super(null, app);
	}

	@Override
	public void execute() {
		System.out.println("登録された本の一覧:");
		if (!app.hasBooks()) {
			System.out.println("本は登録されていません。");
		} else {
			for (String book : app.getBooks()) {
				System.out.println(" - " + book);
			}
		}
	}
}
