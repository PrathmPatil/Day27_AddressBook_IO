package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Contacts contact;
	  static String name;
	  Scanner sc=new Scanner(System.in);
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
	    public void uc3_editContact(){
	      
	        System.out.println("Enter the name ");
	        name=sc.next();
	        if(contacts.get(0).getFirstName().equalsIgnoreCase(name))
	            {
	                System.out.println("Select which one you want to edit");
	                System.out.println("1.First Name\n" +
	                        "2.Last Name\n" +
	                        "3.Address\n" +
	                        "4.City\n" +
	                        "5.State\n" +
	                        "6.Zip\n" +
	                        "7.Phone Number\n" +
	                        "8.Email Id\n");
	                        
	                int option = sc.nextInt();
	                switch(option)
	                {
	                    case 1:
	                        System.out.println("Change first name");
	                        contacts.get(0).setFirstName(sc.next());
	                        break;
	                    case 2:
	                        System.out.println("Change Last name");
	                        contacts.get(0).setLastName(sc.next());
	                        break;
	                    case 3:
	                        System.out.println("Change Address name");
	                        contacts.get(0).setAddress(sc.next());
	                        break;
	                    case 4:
	                        System.out.println("Change City name");
	                        contacts.get(0).setCity(sc.next());
	                        break;
	                    case 5:
	                        System.out.println("Change State name");
	                        contacts.get(0).setState(sc.next());
	                        break;
	                    case 6:
	                        System.out.println("Change Zip");
	                        contacts.get(0).setZip(sc.next());
	                        break;
	                    case 7:
	                        System.out.println("Change Phone number");
	                        contacts.get(0).setPhoneNumber(sc.next());
	                        break;
	                    case 8:
	                        System.out.println("Change Email ID");
	                        contacts.get(0).setEmail(sc.next());
	                        break;
	                    default:
	                        System.out.println("Select correct option");
	                }
	            }
	            else
	            {
	                System.out.println("Cannot find name..."+"\n Please enter valid name.");
	                uc3_editContact();
	            }
	        
	        }
	    public static void main() {
	    	System.out.println("Enter \n 1.Add Contact \n2.Edit Contact \n3.Display");
	    	Scanner sc=new Scanner(System.in);
	    	int choose=sc.nextInt();
	    	switch(choose)
	    	{
	    	case 1:
          	addressbook.uc1_createContact();
          	addressbook.uc2_addContact();
          	main();
              break;
	    	case 2:
	    		addressbook.uc3_editContact();
	    		main();
              break;
	    	case 3:
	    		System.out.println(contacts);
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
