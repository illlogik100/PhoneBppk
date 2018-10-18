/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.Arrays;
import java.lang.Math;
import java.lang.String;

/**
 * HT2 class which is for the Hash Table
 * @author rk
 */
public class HT2 {

    String[] theArray;
    int arraySize;
    int itemsInArray = 0;
    Node[] table;

    // RJ Setting the table size
    private final static int TABLE_SIZE = 13;

    public HT2() {

        table = new Node[TABLE_SIZE];

    }
    
    

    public void HashFunction(int size) {

        arraySize = size;

        theArray = new String[size];

        Arrays.fill(theArray, "-1");
    }
    
    //  RJ  Find method which takes the first name and last name as parameters
    public void find(String firstName, String lastName) {
        
        //RJ Creating a new Person inside the Find()
        Person person = new Person(firstName, lastName);
        
        String name = person.getFirstName();
        //RJ Creating a Hash
        int hash = Math.abs(name.toUpperCase().hashCode() % TABLE_SIZE);
        
               // RJ  If the hash in the table isn't empty then prevEntry becomes null
        if (table[hash] != null) {

            Node prevEntry = null;

            // RJ  The hash goes into the current position
            Node entry = table[hash];


            //RJ  while loop to move entry 
            while (entry != null && !entry.getPerson().getFirstName().equals(name) ) {

                prevEntry = entry;

                entry = entry.getNext();

            }
            
            if (entry == null){
                System.out.println("Not Found");
                return;
            }

            if (entry.getPerson().getFirstName().equals(name)) {

                if (prevEntry == null) {
                    
                    table[hash] = entry.getNext();
                    
                } else {
                    
                    prevEntry.setNext(entry.getNext());
                    
                }
                
                 System.out.println("Found" + " " + entry.getPerson().getFirstName() + " " + entry.getPerson().getLastName() );
               
            }else
                
           System.out.println("Did Not Find" + " " + entry.getPerson().getFirstName() + " " + entry.getPerson().getLastName() );
        }
    }        

        

    

    // RJ function to add raw data into a person, then into a node
    public void add(String firstName, String lastName, String email, String phoneNumber) {
        
        //RJ creates a Person using just the first name and last name
        Person person = new Person(firstName, lastName, email, phoneNumber);
        
        String name = person.getFirstName();

        // RJ Creates the hash
        int hash = Math.abs(name.toUpperCase().hashCode() % TABLE_SIZE);

        if (table[hash] == null) {
            
            table[hash] = new Node(person);
            
            System.out.println(person.getFullName().toUpperCase().toString());
            
        } else {

            Node entry = table[hash];

            while (entry.getNext() != null) {

                entry = entry.getNext();
            }

            entry.setNext(new Node(person));
            System.out.println(person.getFullName().toUpperCase().toString());

        }

    }

    // RJ function to delete a node
    public void delete(String firstName, String lastName) {
        
        //  RJ Creates a Person using just the first name and last name
        Person person = new Person(firstName, lastName);
        
        String name = person.getFirstName();
        
        // RJ Creates the hash
        int hash = Math.abs(name.toUpperCase().hashCode() % TABLE_SIZE);
        
        // RJ  If the hash in the table isn't empty then prevEntry becomes null
        if (table[hash] != null) {

            Node prevEntry = null;

            // RJ  The hash goes into the current position
            Node entry = table[hash];

            //RJ  while loop to move entry 
            while (entry != null && !entry.getPerson().getFirstName().equals(name) ) {

                prevEntry = entry;

                entry = entry.getNext();

            }
            
            if (entry == null){
                System.out.println("Not Deleted");
                return;
            }

            if (entry.getPerson().getFirstName().equals(name)) {

                if (prevEntry == null) {
                    
                    table[hash] = entry.getNext();
                    
                } else {
                    
                    prevEntry.setNext(entry.getNext());
                    
                }
                
                 System.out.println("DELETED" +" " + entry.getPerson().getFirstName().toUpperCase() + " " + entry.getPerson().getLastName().toUpperCase() );
               
            }else
           System.out.println("Not found");
        }

    }

    // RJ a display method to output whole table
    public void displayTable() {

        for (int i = 0; i < 13; i++) {

            System.out.print(i + ": ");

            Node currentNode = table[i];

            while (currentNode != null) {

                System.out.print(currentNode.getPerson().getFirstName() + " " + currentNode.getPerson().getLastName() + " -> ");

                currentNode = currentNode.getNext();

            }

            System.out.println();
        }

    }

}
