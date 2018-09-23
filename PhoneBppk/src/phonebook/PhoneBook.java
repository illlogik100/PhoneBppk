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
        
        
        
        // RJ  Adding elements to the HashTable         
        HTfunction.add("Bob", "Smith", "bsmith@somewhere.com", "555-235-1111");
        HTfunction.add( "Jane", "Williams", "jw@something.com", "555-235-1112");
        HTfunction.add( "Mohammed", "al-Salam", "mas@someplace.com", "555-235-1113");
        HTfunction.add( "Pat", "Jones", "pjones@homesweethome.com", "555-235-1114");
        HTfunction.add( "Billy", "Kidd", "billy_the_kid@nowhere.com", "555-235-1115");
        HTfunction.add( "H.", "Houdini", "houdini@noplace.com", "555-235-1116");
        HTfunction.add( "Jack", "Jones", "jjones@hill.com", "555-235-1117");
        HTfunction.add( "Jill", "Jones", "jillj@hill.com", "555-235-1118");
        HTfunction.add( "John", "Doe", "jdoe@somedomain.com", "555-235-1119");
        HTfunction.add( "Jane", "Doe", "jdoe@somedomain.com", "555-235-1120");
        
        HTfunction.displayTable();
        
         // RJ  Finding elements in the HashTable        
        HTfunction.find( "Pat", "Jones");
        HTfunction.find( "Billy", "Kidd"); 
        
         // RJ  Deleting elements in the HashTable 
        HTfunction.delete("John", "Doe");       
        
        // RJ  a try Catch for the Test case          
        try {
            
                 HTfunction.add(" ",  "  ", "Test_Case@testcase.com", "555-235-1121");
            
        } catch 
                
                (IllegalArgumentException ex) {
            
                 System.out.println("No Input");
            
        }
        
        // RJ  Adding elements to the HashTable 
        HTfunction.add("Nadezhda",  "Kanachekhovskaya", "dr.nadezhda.kanacheckovskaya@somehospital.moscow.ci.ru", "555-235-1122");
        HTfunction.add("Jo", "Wu", "wu@h.com", "555-235-1123");
        HTfunction.add("Millard", "Fillmore", "millard@theactualwhitehouse.us", "555-235-1124");
        HTfunction.add("Bob", "vanDyke", "vandyke@nodomain.com", "555-235-1125");
        HTfunction.add("Upside", "Down", "upsidedown@rightsideup.com", "555-235-1126");
        
        
        // RJ  Finding elements in the HashTable 
        HTfunction.find( "Jack", "Jones");
        HTfunction.find( "Nadezhda", "Kanachekhovskaya");
        
         // RJ  Deleting elements in the HashTable 
        HTfunction.delete( "Jill", "Jones");
        HTfunction.delete("John", "Doe"); 
        
        // RJ  Finding elements in the HashTable 
        HTfunction.find( "Jill", "Jones");
        HTfunction.find( "John", "Doe");
        
        
        HTfunction.displayTable();
        
        
        
        
        // RJ  Adding elements to the btFunction         
        btFunction.add("Bob", "Smith", "bsmith@somewhere.com", "555-235-1111");
        btFunction.add( "Jane", "Williams", "jw@something.com", "555-235-1112");
        btFunction.add( "Mohammed", "al-Salam", "mas@someplace.com", "555-235-1113");
        btFunction.add( "Pat", "Jones", "pjones@homesweethome.com", "555-235-1114");
        btFunction.add( "Billy", "Kidd", "billy_the_kid@nowhere.com", "555-235-1115");
        btFunction.add( "H.", "Houdini", "houdini@noplace.com", "555-235-1116");
        btFunction.add( "Jack", "Jones", "jjones@hill.com", "555-235-1117");
        btFunction.add( "Jill", "Jones", "jillj@hill.com", "555-235-1118");
        btFunction.add( "John", "Doe", "jdoe@somedomain.com", "555-235-1119");
        btFunction.add( "Jane", "Doe", "jdoe@somedomain.com", "555-235-1120");
      
                
         // RJ  Finding elements in the Binary Search Tree    
        btFunction.search( "Mohammed", "al-Salam");
        btFunction.search( "Billy", "Kidd"); 
        
//         // RJ  Deleting elements in the Binary Search Tree        
        btFunction.remove( "Bob", "Smith");
        //btFunction.search( "Bob", "Smith");
        btFunction.remove( "Mohammed", "al-Salam");
//        
//        
//        // RJ  a try Catch for the Test case       
//        try {
//            
//                 btFunction.add(" ",  "  ", "Test_Case@testcase.com", "555-235-1121");
//            
//        } catch 
//                
//                (IllegalArgumentException ex) {
//            
//                 System.out.println("No Input");
//            
//        }
        
        // RJ  Adding elements to the Binary Search Tree
        btFunction.add("Nadezhda",  "Kanachekhovskaya", "dr.nadezhda.kanacheckovskaya@somehospital.moscow.ci.ru", "555-235-1122");
        btFunction.add("Jo", "Wu", "wu@h.com", "555-235-1123");
        btFunction.add("Millard", "Fillmore", "millard@theactualwhitehouse.us", "555-235-1124");
        btFunction.add("Bob", "vanDyke", "vandyke@nodomain.com", "555-235-1125");
        btFunction.add("Upside", "Down", "upsidedown@rightsideup.com", "555-235-1126");
        
         // RJ  Finding elements in the Binary Search Tree
        btFunction.search( "Jack", "Jones");
        btFunction.search( "Nadezhda", "Kanachekhovskaya");
        
//         // RJ  Deleting elements in the Binary Search Tree 
//        btFunction.remove( "Jill", "Jones");
        btFunction.remove( "John", "Doe");
        
         // RJ  Finding elements in the Binary Search Tree
//        btFunction.search( "Jill", "Jones");
//        btFunction.search( "John", "Doe");
//        
//        btFunction.toString();
        
       

//        System.out.print("Size=" + people.size());
//        
//        
//        HashMap theFunc = new HashMap();
//        
//        String[] elementsToAdd2 = people.Person();
//        
//        theFunc.table(elementsToAdd2);
//        
//        HTfunction.add(elementsToAdd2);
        
        //theFunc.hashFunction2(elementsToAdd2, theFunc.theArray);
        
        //theFunc.displayTheStack();
        
    }

}
