

package phonebook;

/**
 * 
 * @author RK Johnson
 * Node Class to work with the HT2 class which is a Hash Table
 */
public class Node {
    
    
   private Person person;
   
   private Node next;
   
   
   // RJ  Creating a Node 
   public Node(Person person){
      
       this.person = person;
   }
   
   // RJ Getters and Setters
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
    

}