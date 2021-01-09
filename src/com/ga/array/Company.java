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

		for(int i=0;i<sList.length;i++){
			if(sList[i]==null) {
			sList[i]=s;
			numS++;
			}}// your code goes here

	}

	// removeStaff deletes the Staff from sList with the same given ID number
	// by shifting the array to the left.
	// If the given ID doesn't exist then false will be returned.
	public boolean removeStaff(String id) {
		boolean done = false;

		for(int i=0;i<numS;i++){
			if(sList[i].getID().equals(id)) {
				done=true;
				numS--;
				sList[i]=sList[i+1];
			}else {
				done=false;
				}
		}// your code goes here

		return done;

	}

	// searchByGender to search sList for the staffs of a specific gender (F or M;
	// where F for female and M for male) and return an array containing these
	// staffs.
	// The size of the returned array should be exactly as the number of Staffs
	// belonging to the selected gender “no empty elements”.

	public Staff[] searchByGender(char g) { // Change void to an array of Staff
		int thelength=0;

		for(int i=0;i<numS;i++){
			if(sList[i].getGender()==g) {
				thelength++;
			}
		}
		Staff[] stafg=new Staff[thelength];
		int num=0;
		for(int j=0;j<numS;j++){
			if(sList[j].getGender()==g) {
				stafg[num]=sList[j];
				num++;
		}// your code goes here
	}return stafg;
	}

	public void printCompany() { // print names and genders
		System.out.format("%10s%10s", "Name", "Gender");
		for (int i = 0; i < numS; i++) {
			sList[i].printStaff();
		}
	}

} // End of Class Company
