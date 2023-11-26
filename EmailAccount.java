package com.email;

import java.util.Scanner;

public class EmailAccount {

	public static void main(String[] args) {
		// Create a Scanner object for user input
		Scanner scanner = new Scanner(System.in);

		// Get user input for email address and mailbox capacity
		System.out.print("Enter your email address: ");
		String emailAddress = scanner.nextLine();

		System.out.print("Enter your desired mailbox capacity (in MB): ");
		int mailboxCapacity = scanner.nextInt();

		// Create an Email object
		Email myEmail = new Email(emailAddress, mailboxCapacity);

		// Display initial details
		System.out.println("Email Address: " + myEmail.getEmailAddress());
		System.out.println("Mailbox Capacity: " + myEmail.getMailboxCapacity() + "MB");
		System.out.println("Password: " + myEmail.getPassword());

		// Set alternate email
		System.out.print("Do you want to set an alternate email? (yes/no): ");
		String setAlternateEmail = scanner.next();
		if (setAlternateEmail.equalsIgnoreCase("yes")) {
			System.out.print("Enter alternate email address: ");
			String alternateEmail = scanner.next();
			myEmail.setAlternateEmail(alternateEmail);
			System.out.println("Alternate Email: " + myEmail.getAlternateEmail());
		}

		// Change mailbox capacity
		System.out.print("Do you want to change the mailbox capacity? (yes/no): ");
		String changeCapacity = scanner.next();
		if (changeCapacity.equalsIgnoreCase("yes")) {
			System.out.print("Enter new mailbox capacity (in MB): ");
			int newCapacity = scanner.nextInt();
			myEmail.setMailboxCapacity(newCapacity);
			System.out.println("Updated Mailbox Capacity: " + myEmail.getMailboxCapacity() + "MB");
		}

		// Change password
		System.out.print("Do you want to change the password? (yes/no): ");
		String changePassword = scanner.next();
		if (changePassword.equalsIgnoreCase("yes")) {
			System.out.print("Enter new password: ");
			String newPassword = scanner.next();
			myEmail.changePassword(newPassword);
			System.out.println("Updated Password: " + myEmail.getPassword());
		}

		// Generate and show a random password
		String randomPassword = myEmail.generateRandomPassword();
		System.out.println("Randomly Generated Password: " + randomPassword);

		// Ask the user if they want to set the random password
		System.out.print("Do you want to set the randomly generated password? (yes/no): ");
		String setRandomPassword = scanner.next();
		if (setRandomPassword.equalsIgnoreCase("yes")) {
			myEmail.changePassword(randomPassword);
			System.out.println("Password updated to the randomly generated password.");
		}

		// Close the Scanner to avoid resource leak
		scanner.close();
	}
}
