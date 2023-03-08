package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends ContactOperations{
	
	    public static void main() {
	    	Main addressbook=new Main();
	    	System.out.println("Enter \n 1.Add Contact \n2.Edit Contact \n3.Display \n4.Delete Contact");
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
	    		break;
	    	case 4:
	    		if(contacts.size()>0)
	    		{
		    		addressbook.uc4_deleteContact();
		    		main();
	    		}
	    		else {
	    			System.out.println("Contacts list is empty.");
	    		}
	    		break;
	    	case 5:
                System.out.println("Enter 1 for City and 2 for State");
                int cityOrState = sc.nextInt();
                if(cityOrState == 1){
                	addressbook.uc8_checkByCity();
                } else if (cityOrState == 2) {
                	addressbook.uc8_checkByState();
                }
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
