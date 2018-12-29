package com.vinnytsoi;

import java.util.Scanner;

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayListContacts arrayListContacts = new ArrayListContacts();
    

    public static void main(String[] args) {

        boolean quit = false;
        int choice;

        String x = "\nPlease choose an option:\n1: Add a new contact\n2: Modify a contact\n3: Remove a contact\n4: Search contact\n5: List contacts\n6: Print menu" +
        "\n7: Quit application\n";
        System.out.println(x);            

        while (quit == false)
        {

            choice = scanner.nextInt();
            scanner.nextLine();
            

            switch (choice) 
            {
                case 1 :
                arrayListContacts.storeContact();
                break;

                case 2 :
                arrayListContacts.modifyContact();
                break;

                case 3 :
                arrayListContacts.removeContact();
                break;

                case 4 :
                arrayListContacts.searchContact();
                break;
                
                case 5:
                arrayListContacts.listContact();
                break;

                case 6:
                System.out.println(x); 
                break;

                case 7:
                quit = true;
                System.out.println("Good bye");
                break;

                default:
                System.out.println("Incorrect entry");
                break;
            }

            System.out.println(x);

        }
    }

}