package com.example.demo.Command;

import java.util.Scanner;

import com.example.demo.App.App;

public abstract class BookCommand implements CommandHandler {
	protected final Scanner scanner;
	protected final App app;

	public BookCommand(Scanner scanner, App app) {
		this.scanner = scanner;
		this.app = app;
	}
}
