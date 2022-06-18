package com.greatlearning.driver;

import java.util.Scanner;


import com.greatlearnning.service.Department;

public class Driver {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Welcome to abc");
		
		Department dp = new Department();
		int input;
		
		System.out.println("\n ----------\n"
	    		+"Enter your choice: \n"
	    		+ "1. Technical\n"
	    		+ "2. Admin\n"
	    		+ "3. Hr\n"
	    		+ "4. Legal\n"
	    	    +  "5. Logout\n");
	    
		do {
			input = sc.nextInt();
			
			switch(input) {
			case 1:
				dp.Technical();
				break;
			case 2:
				dp.Admin();
				break;
			case 3:
				dp.Hr();
				break;
			case 4:
				dp.Legal();
				break;
			}
		}while(input != 5);
		System.out.println("Thankyou");
		

	}
	

}
