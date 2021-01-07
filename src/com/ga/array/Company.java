package com.ga.array;

public class Company {

	// instance variables
	private String name;
	private int numS;
	private Staff[] sList;

	// constructor

	public Company(String name, int size) {
		this.name = name;
		this.numS = 0; // the number of staff is 0 first
		this.sList = new Staff[size]; // size is also the size of Staff array

	}

	// Class methods
	// addStaff adds the received Staff in the first empty location of sList
	public void addStaff(Staff s) {

		// your code goes here

	}

	// removeStaff deletes the Staff from sList with the same given ID number
	// by shifting the array to the left.
	// If the given ID doesn't exist then false will be returned.
	public boolean removeStaff(String id) {
		boolean done = false;

		// your code goes here

		return done;

	}

	// searchByGender to search sList for the staffs of a specific gender (F or M;
	// where F for female and M for male) and return an array containing these
	// staffs.
	// The size of the returned array should be exactly as the number of Staffs
	// belonging to the selected gender “no empty elements”.

	public void searchByGender(char g) { // Change void to an array of Staff

		// your code goes here
	}

	public void printCompany() { // print names and genders
		System.out.format("%10s%10s", "Name", "Gender");
		for (int i = 0; i < numS; i++) {
			sList[i].printStaff();
		}
	}

} // End of Class Company
