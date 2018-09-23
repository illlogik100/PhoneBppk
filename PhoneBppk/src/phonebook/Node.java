/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phonebook;

/**
 * 
 * @author rk
 * Node Class to work with the HT2 class which is a Hash Table
 */
public class Node {
    
    
   private Person person;
   
   private Node next;
   
   
   // RJ  Creating a Node that holds a Person object
   public Node(Person person){
      
       this.person = person;
   }
   
   //
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
   
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
//     
//
//
//        @Override
//    public boolean equals(Object obj) {
//        return this.getKey()==((Node)obj).getKey();
//    }


//        @Override
//    public String toString() {
//        return firstName + " " + lastName + " " + phone + " " + email;
//    }
}