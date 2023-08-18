package org.test;

import org.openqa.selenium.grid.Main;

public class Employee {
	
	{ 
		System.out.println("Hello from non staticblock");
	}
	static{
		System.out.println("Hello from staticblock");
		
	}
	public static void main(String[] args) {
		Employee Emp=new Employee();
        System.out.println("Hello from main static method");
        //Employee Emp=new Employee();
	}
}
