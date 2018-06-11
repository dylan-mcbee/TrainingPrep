package com.revature.helloworld;

import com.revature.pojos.Employee;

public class HelloWorld {


	
	//Main method, executes when we run our application.
	public static void main(String[] args) {
		
		
		// new - creates a Java Object and allocates memory for the object on the heap.
		// our variables should start lowercase, then the other words should be capitalized. 
		Employee employee = new Employee();
		employee.setFirstName("Deku");
		
		//print to the console below
		System.out.println("Hello, " + employee.getFirstName());
		
	}
	
}
