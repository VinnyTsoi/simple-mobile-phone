package com.vinnytsoi;

import java.util.Scanner;
import java.util.ArrayList;


public class ArrayListContacts 
{

    private static Scanner scanner = new Scanner(System.in);

    private static ArrayList<Contacts> contactsArrayList = new ArrayList<Contacts>();


    
    //store contact
    public void storeContact()
    {
        System.out.println("Enter contact name");
        String name = scanner.nextLine();

        System.out.println("Enter contact phone number");
        String phoneNo = scanner.nextLine();

        if (searchContact(name) < 0)
        {
            Contacts contact = new Contacts(name, phoneNo);

            contactsArrayList.add(contact);

            System.out.println("\n" + contact.toString() + " saved\n");
        } 
        else
        {
            System.out.println("Contact already exists");
        }  
    }

       //replace contact at index
       private void replaceContact(int index)
       {
           System.out.println("Enter new contact name");
           String name = scanner.nextLine();
   
           System.out.println("Enter new contact phone number");
           String phoneNo = scanner.nextLine();
   
           Contacts contact = new Contacts(name, phoneNo);
   
           contactsArrayList.set(index, contact);
   
           System.out.println("\n" + contact.toString() + " saved\n");
       }


    // search contact
    public int searchContact(String name)
    {
            
            for(Contacts p:contactsArrayList) 
            {
                if (p.getName().equals(name))
                {
                    return contactsArrayList.indexOf(p);
                }

            }
            return -1;
    }

        // search contact
        public void searchContact(){

            System.out.println("Enter the full name of the contact to search: ");
            String name = scanner.nextLine();

            int index = searchContact(name);
            
            if (index >= 0)
            {
                System.out.println("Contact found: " + contactsArrayList.get(index));
            }
            else 
            {
                System.out.println("Contact not found");
            }
        } 


    //modify
    public void modifyContact()
    {
        
        System.out.println("Enter the full name of the contact to modify: ");
        String name = scanner.nextLine();

        int index = searchContact(name);

        if (index >= 0)
        {
            System.out.println("Contact found: " + contactsArrayList.get(index));
            replaceContact(index);
        }
        else 
        {
            System.out.println("Contact not found");
        }

    }
        
    //remore
    public void removeContact()
    {
        
        System.out.println("Enter the full name of the contact to remove: ");
        String name = scanner.nextLine();

        int index = searchContact(name);

        if (index >= 0)
        {
            System.out.println("Contact removed: " + contactsArrayList.get(index));
            contactsArrayList.remove(index);
        }
        else 
        {
            System.out.println("Contact not found");
        }

    }

  

    // list
    public void listContact()
    {

         System.out.println("Listing all contacts:\n");
    
        for (int i = 0; i < contactsArrayList.size(); i++)
        System.out.println(contactsArrayList.get(i));

        System.out.println();
    }
    
    
}