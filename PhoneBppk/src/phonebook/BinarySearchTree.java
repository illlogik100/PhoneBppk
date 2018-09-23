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
public class BinarySearchTree {

    //RJ Declare a Node
    private BSTNode root;

    private BSTNode parent;

    //private BSTNode newNode;
    public BinarySearchTree() {

        root = null;

    }

    // RJ add function 
    public void add(String firstName, String lastName, String email, String phoneNumber) {

        BSTNode newNode = new BSTNode(firstName, lastName, email, phoneNumber);

        if (root == null) {

            //RJ root becomes new node
            root = newNode;

            System.out.println(root.getPerson().getFullName() + " has been added.");

        } else {

            rAdd(root, newNode);

        }
    }

    public void rAdd(BSTNode root, BSTNode newNode) {

        if (newNode.getPerson().isLessThan(root.getPerson().getFullName())) {
            if (root.getLeft() == null) {

                root.setLeft(newNode);

                newNode.setIsRightChild(false);

                newNode.setParent(root);

            } else {

                rAdd(root.getLeft(), newNode);
            }

        } else {

            if (newNode.getPerson().isGreaterThan(root.getPerson().getFullName())) {
                if (root.getRight() == null) {

                    root.setRight(newNode);

                    newNode.setIsRightChild(true);

                    newNode.setParent(root);

                } else {

                    rAdd(root.getRight(), newNode);

                }

            }

        }

    }

    public BSTNode search(String firstName, String lastName) {
        //BSTNode newNode = new BSTNode(firstName, lastName, "", "");


        BSTNode newNode;
        newNode = rSearch(root, firstName + " " + lastName);
        
        System.out.println(newNode + " was searched for");
        
       return newNode;

    }

    // /RJ  boolean to search for an entry
    public BSTNode rSearch(BSTNode root, String fullName) {

        //RJ function has to compare the actual names because the entry wouldn't match without the other  data fields
        if (root == null){
            
            System.out.println(root + " was null.");
            
        }
        else if (root.getPerson().getFullName().equals(fullName)) {
            
            System.out.println(fullName + " was found.");
            return root;
            
        } else if (root.getPerson().isLessThan(fullName)) {

            if (root.getLeft() == null) {

                //System.out.println(fullName + " was not found.");
                return null;

            } else {

                rSearch(root.getLeft(), fullName);
            }

        } else {

            if (root.getPerson().isGreaterThan(fullName)) {

                if (root.getRight() == null) {

                    //System.out.println(fullName + " was not found.");
                    return null;
                } else {

                    rSearch(root.getRight(), fullName);
                }

            }

        }
        return root;
    }

    //RJ remove function taking firstname and lastname 
    public boolean remove(String firstName, String lastName) {

        String fullName = firstName + " " + lastName;

        BSTNode nodeToDelete = search(firstName, lastName);

        if (nodeToDelete == null) {
            System.out.println(fullName + " was not deleted");
            return false;

        } else {

            rRemove(nodeToDelete, fullName);

        }
        return true;
    }

    // /RJ  boolean to search for an entry
    public BSTNode rRemove(BSTNode nodeToDelete, String fullName) {
        //nodeToDelete has no children
        if (nodeToDelete.getLeft() == null && nodeToDelete.getRight() == null) {

            if (nodeToDelete.isIsRightChild()) {

                nodeToDelete.getParent().setRight(null);

            } else {

                nodeToDelete.getParent().setLeft(null);

            }
        } else if (nodeToDelete.getPerson().isLessThan(fullName)) {
                
                if (nodeToDelete.getParent() != null){

                nodeToDelete.getParent().setLeft(nodeToDelete.getLeft());

                 nodeToDelete.getLeft().setParent(nodeToDelete.getParent());
                 
                 System.out.println(nodeToDelete.getParent() + " is the parent now on the left");
                 
                }
                else {
                    nodeToDelete.setParent(nodeToDelete.getLeft());
                    
                }

        } else if (nodeToDelete.getPerson().isGreaterThan(fullName)) {
            
                if (nodeToDelete.getParent() != null){
                
                nodeToDelete.getParent().setRight(nodeToDelete.getRight());

                 nodeToDelete.getRight().setParent(nodeToDelete.getParent());
                 
                 System.out.println(nodeToDelete.getParent() + " is the parent now on the right");
                } 
                else {
                    nodeToDelete.setParent(nodeToDelete.getRight());
                } 
                    

                
        } else {

            if (nodeToDelete.getLeft() != null && nodeToDelete.getRight() != null) {

            BSTNode rightOfRoot = nodeToDelete.getRight();

            root = minValue(rightOfRoot);
            
            //rightOfRoot = null;
            
            //root.setRight(null);

                //nodeToDelete.getPerson().(lessThanRoot.getPerson().getFirstName()); 
            //rRemove(nodeToDelete, fullName);
            
            //minValue(null);

        }

    }


return root;

//        if (nodeToDelete.getPerson().isEqual(fullName)) {
//
//            if (nodeToDelete.isRightChild = false) {
//
//                System.out.println(fullName + " was deleted.");
//
//                nodeToDelete.getParent().setLeft(null);
//
//                return true;
//            } else {
//
//                if (nodeToDelete.isRightChild = true) {
//                    nodeToDelete.getParent().setRight(null);
//                }
//
//                return false;
//            }
//        }
//
//        if (nodeToDelete.getPerson().isLessThan(fullName)) {
//
//            if (nodeToDelete.getLeft() != null) {
//
//                parent = nodeToDelete.getLeft();
//
//                rRemove(parent, fullName);
//
//            } else {
//
//                System.out.println(fullName + " was not deleted.");
//                return false;
//            }
//
//        } else if (nodeToDelete.getPerson().isGreaterThan(fullName)) {
//
//            if (nodeToDelete.getRight() != null) {
//
//                parent = nodeToDelete.getRight();
//
//                rRemove(parent, fullName);
//
//            } else {
//
//                System.out.println(fullName + " was not deleted.");
//                return false;
//            }
//
//        } else {
//
//            if (nodeToDelete.getLeft() != null && nodeToDelete.getRight() != null) {
//
//                BSTNode rightOfRoot = nodeToDelete.getRight();
//
//                BSTNode lessThanRoot = minValue(rightOfRoot);
//
//                nodeToDelete = lessThanRoot;
//
//                rRemove(nodeToDelete, fullName);
//
//                lessThanRoot = null;
//
//            }
//
//        }
//
//        return true;
    }

    public BSTNode minValue(BSTNode root) {

        if (root.getLeft() == null) {

            return root.getLeft();

        } else {

            return minValue(root.getLeft());

        }

    }

}
