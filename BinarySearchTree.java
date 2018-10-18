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
    public BSTNode add(String firstName, String lastName, String email, String phoneNumber) {

        BSTNode newNode = new BSTNode(firstName.toUpperCase(), lastName.toUpperCase(), email, phoneNumber);
        BSTNode result = null;

        if (root == null) {

            //RJ root becomes new node
            root = newNode;

            System.out.println(root.getPerson().getFullName() + " has been added as the root.");

        } else {

            result = rAdd(root, newNode);

        }

        //displayTree(root);
        return result;
    }
// Recursive add method
    public BSTNode rAdd(BSTNode root, BSTNode newNode) {

        BSTNode result = null;
        Boolean found = false;
        if (root == null){
            root = newNode;
            result = root;
            return result;
        }

        while (!found) {
            if (newNode.getPerson().equals(root.getPerson())) {
                found = true;
                result = newNode;
                root.setData(newNode);
            } else if (newNode.getPerson().isLessThan(root.getPerson().getFullName())) {
                if (root.getLeft() == null) {

                    root.setLeft(newNode);

                    newNode.setIsRightChild(false);

                    newNode.setParent(root);

                    found = true;
                    
                    System.out.println(newNode.getPerson().getFullName() + " has been added as " + root.getPerson().getFullName() + "'s left child");

                } else {

                    rAdd(root.getLeft(), newNode);
                }

            } else {

                if (newNode.getPerson().isGreaterThan(root.getPerson().getFullName())) {
                    if (root.getRight() == null) {

                        root.setRight(newNode);

                        newNode.setIsRightChild(true);

                        newNode.setParent(root);

                        found = true;
                        
                        System.out.println(newNode.getPerson().getFullName() + " has been added as " + root.getPerson().getFullName() + "'s right child");

                    } else {

                        rAdd(root.getRight(), newNode);

                    }

                }

            }
                break;
        }
        
        return result;
    }

    public BSTNode search(String firstName, String lastName) {

            
        return rSearch(root, (firstName + " " + lastName).toUpperCase());
     
    }

    // /RJ  boolean to search for an entry
    public BSTNode rSearch(BSTNode root, String fullName) {

        
        //RJ function has to compare the actual names because the entry wouldn't match without the other  data fields
        if (root == null) {

            System.out.println(root + " was null.");
            return null;

        } else if (root.getPerson().getFullName().equals(fullName)) {

            System.out.println(fullName + " was found.");
            return root;

        } else if (root.getPerson().isLessThan(fullName)) {

            if (root.getRight() == null) {

                System.out.println(fullName + " was not found.");
                return null;

            } else {

                return rSearch(root.getRight(), fullName);
            }

        } else {

            if (root.getPerson().isGreaterThan(fullName)) {

                if (root.getLeft() == null) {

                    System.out.println(fullName + " was not found.");
                    return null;
                } else {

                    return rSearch(root.getLeft(), fullName);
                }

            }

        }
        return root;
    }

    //RJ remove function taking firstname and lastname 
    public boolean remove(String firstName, String lastName) {

        String fullName = firstName.toUpperCase() + " " + lastName.toUpperCase();

        BSTNode nodeToDelete = search(firstName.toUpperCase(), lastName.toUpperCase());

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
            System.out.println(nodeToDelete.getPerson().getFullName() + " Node has no children, node deleted");

            //nodeToDelete has one leftChild
        } else if (nodeToDelete.getLeft() != null && nodeToDelete.getRight() == null) {

            if (nodeToDelete.isIsRightChild()) {

                nodeToDelete.getParent().setRight(nodeToDelete.getLeft());

            } else {
                nodeToDelete.getParent().setLeft(nodeToDelete.getLeft());

            }

            nodeToDelete.getLeft().setParent(nodeToDelete.getParent());

            System.out.println(nodeToDelete.getPerson().getFullName() + " Node has one left child, node deleted");

            //nodeToDelete has one rightChild
        } else if (nodeToDelete.getLeft() == null && nodeToDelete.getRight() != null) {

            if (nodeToDelete.isIsRightChild()) {

                nodeToDelete.getParent().setRight(nodeToDelete.getRight());

            } else {
                nodeToDelete.getParent().setLeft(nodeToDelete.getRight());

            }

            nodeToDelete.getRight().setParent(nodeToDelete.getParent());

            System.out.println(nodeToDelete.getPerson().getFullName() + " Node has one right child, node deleted");

            //nodeToDelete has two children
        } else {

            BSTNode rightOfRoot = nodeToDelete.getRight();

            BSTNode minNode = minValue(rightOfRoot);

            nodeToDelete.setPerson(minNode.getPerson());

            minNode.getParent().setLeft(null);

            System.out.println(nodeToDelete.getPerson().getFullName() + " node had two children, node was deleted");

        }

        return root;

    }
// RJ finds the minimum value
    public BSTNode minValue(BSTNode root) {

        if (root.getLeft() == null) {

            return root;

        } else {

            return minValue(root.getLeft());

        }

    }

    //pre-order traversal
    public void displayTree(BSTNode root) {

        if (root == null) {
            return;
        } else {

            System.out.println(root.getPerson().getFullName());

            if (root.getLeft() != null) {

                displayTree(root.getLeft());

            } else {
                return;
            }

            if (root.getRight() != null) {

                displayTree(root.getRight());

            } else {
                return;

            }
        }

    }

}
