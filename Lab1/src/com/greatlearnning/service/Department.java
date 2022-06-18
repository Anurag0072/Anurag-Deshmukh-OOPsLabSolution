package com.greatlearnning.service;

import com.greatlearning.models.Employee;

public class Department {
	Employee ep = new Employee("Anurag","Deshmukh");
	Password ps = new Password();
	
//	public void showCredentials() {
//		System.out.println("Dear"+" "+ ep.getfirstName()+" "+"your generated credentials are as follows");
//		System.out.println("Email------>"+ep.getfirstName()+ep.getlastName()+Technical());
//		System.out.println("Password--->"+ps.generatePassword(8));
//		
//	}
	
	@SuppressWarnings("static-access")
	public void Technical() {
		
		ep.getfirstName();
		ep.getlastName();
		//showCredentials();
		System.out.println("Dear"+" "+ ep.getfirstName()+" "+"your generated credentials are as follows");
		System.out.println("Email------>"+ep.getfirstName()+ep.getlastName()+"@tech.abc.com");
		System.out.println("Password--->"+ps.generatePassword(8));
		//return "@tech.abc.com";
		//return technical;
	}
	@SuppressWarnings("static-access")
	public void Admin() {
		ep.getfirstName();
		ep.getlastName();
		System.out.println("Dear"+" "+ ep.getfirstName()+" "+"your generated credentials are as follows");
		System.out.println("Email------>"+ep.getfirstName()+ep.getlastName()+"@admin.abc.com");
		System.out.println("password--->"+ps.generatePassword(8));
		
	}
	@SuppressWarnings("static-access")
	public void Hr() {
		ep.getfirstName();
		ep.getlastName();
		System.out.println("Dear"+" "+ ep.getfirstName()+" "+"your generated credentials are as follows");
		System.out.println("Email------>"+ep.getfirstName()+ep.getlastName()+"@hr.abc.com");
		System.out.println("password--->"+ps.generatePassword(8));
	}
	@SuppressWarnings("static-access")
	public void Legal() {
		ep.getfirstName();
		ep.getlastName();
		System.out.println("Dear"+ " "+ ep.getfirstName()+" "+"your generated credentials are as follows");
		System.out.println("emaail----->"+ep.getfirstName()+ep.getlastName()+"@legal.abc.com");
		System.out.println("password--->"+ps.generatePassword(8));

	}
}
