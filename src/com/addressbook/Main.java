package com.addressbook;

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
                     System.out.println("Enter the name of city ");
                     String city=sc.next();
                     addressbook.uc8_checkByCity(city).forEach(checkCity -> System.out.println(checkCity));
                     main();
                 } else if (cityOrState == 2) {
                     System.out.println("Enter the name of state ");
                     String state=sc.next();
                     addressbook.uc8_checkByState(state).forEach(checkState -> System.out.println(checkState));
                     main();
                 }
                 break;
             case 6:
                 System.out.println("Enter 1 for City and 2 for State");
                 int dictionaryCityOrState = sc.nextInt();
                 if(dictionaryCityOrState == 1){
                	 addressbook.uc9_cityDictionary();
                	 main();
                 } else if (dictionaryCityOrState == 2) {
                	 addressbook.uc9_stateDictionary();
                	 main();
                 }
                 break;
             case 7:
                 System.out.println("Enter 1 for CityCount and 2 for StateCount");
                 int countCityOrState = sc.nextInt();
                 if(countCityOrState == 1){
                	 addressbook.uc10_cityCount();
                	 main();
                 } else if (countCityOrState == 2) {
                	 addressbook.uc10_stateCount();
                	 main();
                 }
                 break;
             case 8:
            	 addressbook.uc11_sortByName();
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
