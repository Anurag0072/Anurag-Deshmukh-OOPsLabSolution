package com.greatlearnning.service;

import java.util.Random;

public class Password {
	
	static char[] generatePassword(int length) {
		String Capson = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Capsoff = "abcdefghijklmnopqrstuvwxyz";
		String specialchars = "!@#$%^&*()";
		String numbers = "1234567890";
		String allcombine = Capson+Capsoff+specialchars+numbers;
		Random random = new Random();
		char[] password = new char[length];
		
		password[0] = Capson.charAt(random.nextInt(Capson.length()));
		password[1] = Capsoff.charAt(random.nextInt(Capsoff.length()));
		password[2] = specialchars.charAt(random.nextInt(specialchars.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));
		
		for(int i = 4; i< length; i++) {
			password[i] = allcombine.charAt(random.nextInt(allcombine.length()));
		}
		return password;
		
		
		
	}

}

