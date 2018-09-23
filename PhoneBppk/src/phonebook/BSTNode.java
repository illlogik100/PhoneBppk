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


    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append(person.getFullName());

        builder.append(" LeftChild : " + left.getPerson().getFullName());

        builder.append(" RightChild : " + right.getPerson().getFullName());

        return builder.toString();
    }



    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = this.person;
    }

//    BSTNode getLeftChild() {
//        return this.leftChild;
//    }
//
//    public void setLeftChild(BSTNode leftChild) {
//        this.leftChild = leftChild;
//    }
//
//    BSTNode getRightChild() {
//        return this.rightChild;   
//    }
//
//    public void setRightChild(BSTNode rightChild) {
//        this.rightChild = rightChild;
    //   }

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
