package com.ga.array;

public class Staff {

	// instance variables
	private String name;
	private String ID;
	private double salary;
	private char gender;

	// constructors

	public Staff(String name, String ID, double salary, char gender) {
		this.name = name;
		this.ID = ID;
		this.salary = salary;
		this.gender = gender;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void printStaff() {
		System.out.format("%10s%10s", this.name, this.gender);
	}
} // End of Staff Class
