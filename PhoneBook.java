/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phonebook;

/**
 *
 * @author rk
 */
public class PhoneBook {

    
//   RJ   Main application that adds, finds, and deletes the data through a HashMap 
//    and Binary Search Tree function
    
    public static void main(String[] args) {
        
        // RJ Creating an instance of HashTable         
        HT2 HTfunction = new HT2(); 
        
        // RJ  Creating an instance of BinarySearchTree        
        BinarySearchTree btFunction = new BinarySearchTree();
        
        
        
 //        RJ  Adding elements to the HashTable  
        System.out.print("Test Case 1: ");
        HTfunction.add("Bob", "Smith", "bsmith@somewhere.com", "555-235-1111");
        
        System.out.print("Test Case 2: ");
        HTfunction.add( "Jane", "Williams", "jw@something.com", "555-235-1112");
        
        System.out.print("Test Case 3: ");
        HTfunction.add( "Mohammed", "al-Salam", "mas@someplace.com", "555-235-1113");
        
        System.out.print("Test Case 4: ");
        HTfunction.add( "Pat", "Jones", "pjones@homesweethome.com", "555-235-1114");
        
        System.out.print("Test Case 5: ");
        HTfunction.add( "Billy", "Kidd", "billy_the_kid@nowhere.com", "555-235-1115");
        
        System.out.print("Test Case 6: ");
        HTfunction.add( "H.", "Houdini", "houdini@noplace.com", "555-235-1116");
        
        System.out.print("Test Case 7: ");
        HTfunction.add( "Jack", "Jones", "jjones@hill.com", "555-235-1117");
        
        System.out.print("Test Case 8: ");
        HTfunction.add( "Jill", "Jones", "jillj@hill.com", "555-235-1118");
        
        System.out.print("Test Case 9: ");
        HTfunction.add( "John", "Doe", "jdoe@somedomain.com", "555-235-1119");
        
        System.out.print("Test Case 10: ");
        HTfunction.add( "Jane", "Doe", "jdoe@somedomain.com", "555-235-1120");
        
 //       HTfunction.displayTable();
        
 //         RJ  Finding elements in the HashTable 
 
        System.out.print("Test Case 11: ");
        HTfunction.find( "Pat", "Jones");
        
        System.out.print("Test Case 12: ");
        HTfunction.find( "Billy", "Kidd"); 
        
 //         RJ  Deleting elements in the HashTable 
 
        System.out.print("Test Case 13: ");
        HTfunction.delete("John", "Doe");       
        
        System.out.print("Test Case 14: ");            
        HTfunction.add("Test",  "Case", "Test_Case@testcase.com", "555-235-1121");
            
       
        
        // RJ  Adding elements to the HashTable 
        System.out.print("Test Case 15: ");
        HTfunction.add("Nadezhda",  "Kanachekhovskaya", "dr.nadezhda.kanacheckovskaya@somehospital.moscow.ci.ru", "555-235-1122");
        
        System.out.print("Test Case 16: ");
        HTfunction.add("Jo", "Wu", "wu@h.com", "555-235-1123");
        
        System.out.print("Test Case 17: ");
        HTfunction.add("Millard", "Fillmore", "millard@theactualwhitehouse.us", "555-235-1124");
        
        System.out.print("Test Case 18: ");
        HTfunction.add("Bob", "vanDyke", "vandyke@nodomain.com", "555-235-1125");
        
        System.out.print("Test Case 19: ");
        HTfunction.add("Upside", "Down", "upsidedown@rightsideup.com", "555-235-1126");
        
//        HTfunction.displayTable();
       
 //        RJ  Finding elements in the HashTable
        System.out.print("Test Case 20: ");
        HTfunction.find( "Jack", "Jones");
        
        System.out.print("Test Case 21: ");
        HTfunction.find( "Nadezhda", "Kanachekhovskaya");
        
         // RJ  Deleting elements in the HashTable 
        System.out.print("Test Case 22: ");
        HTfunction.delete( "Jill", "Jones");
        
        System.out.print("Test Case 23: ");
        HTfunction.delete("John", "Doe"); 
        
 //        RJ  Finding elements in the HashTable 
        System.out.print("Test Case 24: ");
        HTfunction.find( "Jill", "Jones");
        
        System.out.print("Test Case 25: ");
        HTfunction.find( "John", "Doe");
        
      
        HTfunction.displayTable();
        System.out.println(" ");
        System.out.println(" ");
        
        
        
 //        RJ  Adding elements to the btFunction   
 
        System.out.print("Test Case 1: ");
        btFunction.add("Bob", "Smith", "bsmith@somewhere.com", "555-235-1111");
        
        System.out.print("Test Case 2: ");
        btFunction.add( "Jane", "Williams", "jw@something.com", "555-235-1112");
        
        System.out.print("Test Case 3: ");
        btFunction.add( "Mohammed", "al-Salam", "mas@someplace.com", "555-235-1113");
        
        System.out.print("Test Case 4: ");
        btFunction.add( "Pat", "Jones", "pjones@homesweethome.com", "555-235-1114");
        
        System.out.print("Test Case 5: ");
        btFunction.add( "Billy", "Kidd", "billy_the_kid@nowhere.com", "555-235-1115");
        
        System.out.print("Test Case 6: ");
        btFunction.add( "H.", "Houdini", "houdini@noplace.com", "555-235-1116");
        
        System.out.print("Test Case 7: ");
        btFunction.add( "Jack", "Jones", "jjones@hill.com", "555-235-1117");
        
        System.out.print("Test Case 8: ");
        btFunction.add( "Jill", "Jones", "jillj@hill.com", "555-235-1118");
        
        System.out.print("Test Case 9: ");
        btFunction.add( "John", "Doe", "jdoe@somedomain.com", "555-235-1119");
        
        System.out.print("Test Case 10: ");
        btFunction.add( "Jane", "Doe", "jdoe@somedomain.com", "555-235-1120");
         
                
         // RJ  Finding elements in the Binary Search Tree 
        System.out.print("Test Case 11: ");
        btFunction.search( "Pat", "Jones");
        
        System.out.print("Test Case 12: ");
        btFunction.search( "Billy", "Kidd"); 
        
         // RJ  Deleting elements in the Binary Search Tree 
        System.out.print("Test Case 13: "); 
        btFunction.remove( "John", "Doe");

        
        
        // RJ  a try Catch for the Test case   
        System.out.print("Test Case 14: ");
        
        btFunction.add("Test",  "Case", "Test_Case@testcase.com", "555-235-1121");
            
      
        
        // RJ  Adding elements to the Binary Search Tree
        System.out.print("Test Case 15: ");
        btFunction.add("Nadezhda",  "Kanachekhovskaya", "dr.nadezhda.kanacheckovskaya@somehospital.moscow.ci.ru", "555-235-1122");
        
        System.out.print("Test Case 16: ");
        btFunction.add("Jo", "Wu", "wu@h.com", "555-235-1123");
        
        System.out.print("Test Case 17: ");
        btFunction.add("Millard", "Fillmore", "millard@theactualwhitehouse.us", "555-235-1124");
        
        System.out.print("Test Case 18: ");
        btFunction.add("Bob", "vanDyke", "vandyke@nodomain.com", "555-235-1125");
        
        System.out.print("Test Case 19: ");
        btFunction.add("Upside", "Down", "upsidedown@rightsideup.com", "555-235-1126");
        
//          RJ  Finding elements in the Binary Search Tree
        System.out.print("Test Case 20: ");
        btFunction.search( "Jack", "Jones");
        
        System.out.print("Test Case 21: ");
        btFunction.search( "Nadezhda", "Kanachekhovskaya");
        
         // RJ  Deleting elements in the Binary Search Tree 
        System.out.print("Test Case 22: ");
        btFunction.remove( "Jill", "Jones");
        
        System.out.print("Test Case 23: ");
        btFunction.remove( "John", "Doe");
        
//          RJ  Finding elements in the Binary Search Tree
        System.out.print("Test Case 24: ");
        btFunction.search( "Jill", "Jones");
        
        System.out.print("Test Case 25: ");
        btFunction.search( "John", "Doe");
        
        
 //       btFunction.toString();
        

        
    }

}
