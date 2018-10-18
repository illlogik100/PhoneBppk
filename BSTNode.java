/*

 */
package phonebook;

/**
 *
 * @author RK Johnson
 */

   
public class BSTNode {

    private Person person;

    private BSTNode left;

    private BSTNode right;
    
    private BSTNode parent;

    private BSTNode data;
    
    

    boolean isRightChild = true;

    // RJ Node constructor with a Person object
    public BSTNode(String firstName, String lastName, String email, String phoneNumber) {

        Person person = new Person(firstName, lastName, email, phoneNumber);

        this.person = person;

        left = null;

        right = null;

    }


// RJ Getters and Setters
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = this.person;
    }

    public BSTNode getParent() {
        return parent;
    }

    public void setParent(BSTNode parent) {
        this.parent = parent;
    }
    
    
    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public BSTNode getData() {
        return data;
    }

    public void setData(BSTNode data) {
        
        this.data = data;
    }

    public boolean isIsRightChild() {
        return isRightChild;
    }

    public void setIsRightChild(boolean isRightChild) {
        this.isRightChild = isRightChild;
    }
    

}
