package com.example.demo.Command;

import com.example.demo.App.App;

public class FindCommand extends BookCommand {
	public FindCommand(App app) {
		super(null, app);
	}

	@Override
	public void execute() {
		System.out.println("登録された本の一覧:");
		for (String book : app.getBooks()) {
			System.out.println(" - " + book);
		}
	}
}