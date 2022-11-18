package com.blz.addressbook;

import java.util.Scanner;

public class AddressBook {
	
	String fName, lName, address, city, state, email;
	  int zip;
	  long phNum;

	  Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("--Welcom to address book program--");
		
		  AddressBook obj = new AddressBook();
		  obj.getInputs();
		  
		}
	
		  void getInputs() {
		    System.out.print("Enter your first name: ");
		    
			Object fName = sc.nextLine();

		    System.out.print("Enter your last name: ");
		    lName = sc.nextLine();

		    System.out.print("Enter your address: ");
		    address = sc.nextLine();

		    System.out.print("Enter your city: ");
		    city = sc.nextLine();

		    System.out.print("Enter your state: ");
		    state = sc.nextLine();

		    System.out.print("Enter your email: ");
		    email = sc.nextLine();

		    System.out.print("Enter your area zip code: ");
		    zip = sc.nextInt();

		    System.out.print("Enter your phone number: ");
		    phNum = sc.nextLong();
		    
		  }
}
