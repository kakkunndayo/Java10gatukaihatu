package com.example.demo.Command;

import java.util.Scanner;

public class ExitCommand implements CommandHandler {
	private final Scanner scanner;

	public ExitCommand(Scanner scanner) {
		this.scanner = scanner;
	}

	@Override
	public void execute() {
		System.out.println("操作が終了しました");
	}
}
