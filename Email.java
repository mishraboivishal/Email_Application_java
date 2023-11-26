package com.email;

import java.security.SecureRandom;
import java.util.Random;

public class Email {

	private String emailAddress;
    private int mailboxCapacity;
    private String alternateEmail;
    private String password;

    // Constructor
    public Email(String emailAddress, int mailboxCapacity) {
        this.emailAddress = emailAddress;
        this.mailboxCapacity = mailboxCapacity;
        this.password = generateRandomPassword();
    }

    // Getters and Setters (unchanged)

    // Method for secure random password generation
    String generateRandomPassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
        StringBuilder randomPassword = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();

        for (int i = 0; i < 10; i++) {
            int index = secureRandom.nextInt(characters.length());
            randomPassword.append(characters.charAt(index));
        }

        return randomPassword.toString();
	}

	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMailboxCapacity() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAlternateEmail(String alternateEmail2) {
		// TODO Auto-generated method stub
		
	}

	public String getAlternateEmail() {
		// TODO Auto-generated method stub
	   return null;
	}

	public void setMailboxCapacity(int newCapacity) {
		// TODO Auto-generated method stub
		
	}

	public void changePassword(String newPassword) {
		// TODO Auto-generated method stub
		
	}

}
