package com.addressbook;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main extends ContactOperations{
	
	    public static void main() throws Exception{
	    	Main addressbook=new Main();
	    	System.out.println("1.Add Contact\n" +
                    "2.Edit Contact\n" +
                    "3.Display\n" +
                    "4.Delete\n" +
                    "5.Check by City or State\n" +
                    "6.Dictionary for city or state\n" +
                    "7.Count for city or state\n" +
                    "8.Sort the list\n" +
                    "9.Write into File\n" +
                    "10.Read from file\n");
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
	    		addressbook.displayContact();
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
                 System.out.println("Select option\n" +
                         "1.By Name\n" +
                         "2.By City\n" +
                         "3.By State\n" +
                         "4.By ZipCode");
                 int sortOption = sc.nextInt();
                 switch (sortOption){
                     case 1:
                    	 addressbook.uc11_sortByName();
                         break;
                     case 2:
                    	 addressbook.uc12_sortByCity();
                         break;
                     case 3:
                    	 addressbook.uc12_sortByState();
                         break;
                     case 4:
                    	 addressbook.uc12_sortByZip();
                         break;
                     default:
                         System.out.println("Enter correct option");
                         break;
                 }
            	 main();
            	 break;
             case 9:
                 FileWriter fileWriter = new FileWriter("C:\\Users\\Prathmesh Patil\\eclipse-workspace\\Sumit\\src\\Day27_AddressBook_IO\\src\\com\\addressbook\\ContactsOfAddressbook.txt");
                 for(Contacts cont : contacts){
                     fileWriter.write(cont.toString());
                     System.out.println(cont.toString());
                     fileWriter.close();
                 }
            	 main();
                 break;
             case 10:
                 File file = new File("C:\\Users\\Prathmesh Patil\\eclipse-workspace\\Sumit\\src\\Day27_AddressBook_IO\\src\\com\\addressbook\\ContactsOfAddressbook.txt");
                 Scanner scanner = new Scanner(file);
                 while(scanner.hasNextLine()){
                     System.out.println(scanner.nextLine());
                 }
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
	        try {
				main();
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }
}
