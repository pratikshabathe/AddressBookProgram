package com.blz.addressbook;

import java.util.Scanner;

public class Contact {
	
	String fName, lName, address, city, state, email;
		int zip;
		long phNum;

		Scanner sc = new Scanner(System.in);
 
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

		Contact[] addContact(Contact[] contacts, Contact obj) {
			Object contact ;
			for (int i = 0; i < contacts.length; i++) {
				if (contacts[i] == null) {
					contacts[i] = obj;
					break;
				}
			}
			int i;
			System.out.println("a new contact has been added :" ) ;
			return contacts;
		}
		
		Contact[] editContact(Contact[] contacts, short index) {
			
			Contact obj2 = new Contact();
			obj2.getInputs();
			contacts[index] = obj2;
			System.out.println("contact has been updated ");
			return contacts;
		}
		
		short getIndex(Contact[] contacts, String name) {
			short found = -1;
			for (short i = 0; i < contacts.length; i++) {
				if (contacts[i] != null && contacts[i].fName.equals(name)) {
					found = i;
					break;
				}
			}
			return found;
		}
		
		Contact[] deleteContact(Contact[] contacts, short index) {
			for(short i = index ; i < contacts.length; i++) {
				contacts[i] = contacts[i + 1];
				if(contacts[i + 1] == null)
					break;
			}
			return contacts;
		}
		
		Contact[] showEditDelete(Contact[] contacts, String str) {
			
			if(contacts[0] == null) {
				System.out.println("you have no contacts yet. 'add' one before you  "+ str + ". \n");
			return contacts;
			}else {
				System.out.print("your contacts are :");
				for(Contact obj : contacts) {
					if(obj != null) System.out.println(obj.fName + ", ");
					else break;
				}
				System.out.println();
				
				System.out.print("\n Enter a name to " + str + " mind the case ");
				String name = sc.nextLine();
				
				short index = getIndex(contacts, name);
				
				if(index == -1) {
					System.out.println("we couldn't find" + name + ". try again ");
				}else {
					switch (str) {
					
					case "edit" :
						System.out.println("\n* " + name + " is being edited *");
						contacts = editContact(contacts, index);
						break;
						
					case "delete":
						contacts = deleteContact(contacts, index);
						System.out.println("contact " + name + "has been deleted");
						break;
						
					case "show":
						showDetails(contacts, index);
						break;
						
					default :
						break;
					}
				}
				return contacts;
			}
		}

			void showDetails(Contact[] obj, short i) {
				  System.out.println("Name: " +obj[i].fName + " " + obj[i].lName + "\nAddress: " + obj[i].address + "\nCity: " + "\t\tState: " + obj[i].state + "\t\tZip: " + obj[i].zip + "\nEmail: " + obj[i].email + "\t\tPhone number: " + obj.length + "\n" );
			  }
			}