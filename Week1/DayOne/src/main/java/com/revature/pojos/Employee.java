package com.revature.pojos;

public class Employee {

	private int id;
	
	private String firstName, lastName, email;
	
	//No-args constructor
	public Employee(){
		
	}
	
	
	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	/*
	 * Besides access modifiers, we have getters and setters to retrieve private fields from a public constructor.
	 * That way, we limit access to these and don't mess with them in other parts of our program.
	 */
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
