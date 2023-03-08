package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


	 static Contacts contact;
	    static ArrayList<Contacts> contacts = new ArrayList<Contacts>();
	    static Main addressbook=new Main();
	    public void uc1_createContact(){
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter First Name");
	        String firstName=sc.nextLine();
	        System.out.println("Enter Last Name");
	        String lastName=sc.nextLine();
	        System.out.println("Enter Address");
	        String address=sc.nextLine();
	        System.out.println("Enter City");
	        String city=sc.nextLine();
	        System.out.println("Enter State");
	        String state=sc.nextLine();
	        System.out.println("Enter Zip code");
	        String zip=sc.nextLine();
	        System.out.println("Enter Phone Number");
	        String phoneNumber=sc.nextLine();
	        System.out.println("Enter Email");
	        String email=sc.nextLine();
	        contact=new Contacts(firstName,lastName,address,city,state,zip,phoneNumber,email); 
	    }
	    public void uc2_addContact() {
	        contacts.add(contact);
	    }
	    public static void main() {
	    	System.out.println("Enter \n 1.Add Contact");
	    	Scanner sc=new Scanner(System.in);
	    	int choose=sc.nextInt();
	    	switch(choose)
	    	{
	    	case 1:
         	addressbook.uc1_createContact();
         	addressbook.uc2_addContact();
         	main();
             break;
         default:
             	System.out.println("Please enter valid number.");
             	break;
	    		
	    	}
	    }
	    public static void main(String[] args) {
	        System.out.println("Welcome to Address Book");
	        System.out.println("***********************");
	        main();
	    }
}
