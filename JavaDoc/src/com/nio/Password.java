package com.nio;

import java.io.Console;
import java.io.IOException;
import java.util.Arrays;

public class Password {

	public static void main(String[] args) throws IOException {

		Console c = System.console();

		if (c == null) {

			System.err.println("No console");
			System.exit(1);
		}

		String login = c.readLine("Entyer your login password");

		char[] oldPassword = c.readPassword("Enter your old password");

		if (verify(login, oldPassword)) {

			boolean noMatch;

			do {

				char[] newPassword1 = c.readPassword("Enter your new password");
				char[] newPassword2 = c
						.readPassword("Enter new password again");

				noMatch = !Arrays.equals(newPassword1, newPassword2);

				if (noMatch) {

					c.format("Password not mathc. Try again.%n");

				} else {

					change(login, newPassword1);

					c.format("Password for %s change.%n", login);
				}

				Arrays.fill(newPassword1, ' ');
				Arrays.fill(newPassword2, ' ');

			} while (noMatch);

		}

		Arrays.fill(oldPassword, ' ');
	}

	static void change(String login, char[] password) {
		// TODO Auto-generated method stub

	}

	private static boolean verify(String login, char[] password) {
		// TODO Auto-generated method stub

		return true;
	}

}
