package com.bporamin.tree;

/**
 * Created by Fang on 3/12/2017.
 */
public class BinarySearchTree {

    public static Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.print(" " + root.value);
            display(root.right);
        }
    }

    public boolean contains(int value) {
        Node current = root;
        while (current != null) {
            if (value == current.value)
                return true;
            else if (value < current.value)
                current = current.left;
            else
                current = current.right;
        }
        return false;
    }

    public Node findNode(int value) {
        Node current = root;
        while (current != null) {
            if (value == current.value)
                return current;
            else if (value < current.value)
                current = current.left;
            else
                current = current.right;
        }
        return null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;
        while (true) {
            parent = current;
            if (value < parent.value) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }

    }

    public boolean delete(int value) {

        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current.value != value) {
            parent = current;
            if (current.value > value) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }

        // Case 1
        //if i am here that means we have found the node
        //Case 1: if node to be deleted has no children
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            }
            if (isLeftChild == true) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        //Case 2 : if node to be deleted has only one child
        else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else if (current.left != null && current.right != null) {

            //now we have found the minimum element in the right sub tree
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }

        return true;

    }

    public Node getSuccessor(Node deleteNode){
        Node successor =null;
        Node successorParent =null;
        Node current = deleteNode.right;
        while(current!=null){
            successorParent = successor;
            successor = current;
            current = current.left;
        }
        //check if successor has the right child, it cannot have left child for sure
        // if it does have the right child, add it to the left of successorParent.
        if(successor!=deleteNode.right){
            successorParent.left = successor.right;
            successor.right = deleteNode.right;
        }
        return successor;
    }

    public int findDistance(Node root, int n1, int n2) {
        int x = pathLength(root, n1) - 1;
        int y = pathLength(root, n2) - 1;
        int lcaData = findLCA(root, n1, n2).value;
        int lcaDistance = pathLength(root, lcaData) - 1;
        return (x + y) - 2 * lcaDistance;
    }

    public int pathLength(Node root, int n1) {
        if (root != null) {
            int x = 0;
            if ((root.value == n1) || (x = pathLength(root.left, n1)) > 0
                    || (x = pathLength(root.right, n1)) > 0) {
                // System.out.println(root.data);
                return x + 1;
            }
            return 0;
        }
        return 0;
    }

    public Node findLCA(Node root, int n1, int n2) {
        if (root != null) {
            if (root.value == n1 || root.value == n2) {
                return root;
            }
            Node left = findLCA(root.left, n1, n2);
            Node right = findLCA(root.right, n1, n2);

            if (left != null && right != null) {
                return root;
            }
            if (left != null) {
                return left;
            }
            if (right != null) {
                return right;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(3);
        bst.insert(8);
        bst.insert(1);
        bst.insert(4);
        bst.insert(6);
        bst.insert(2);
        bst.insert(10);
        bst.insert(9);
        bst.display(bst.root);
        System.out.print("\n");

        System.out.println(bst.contains(3));

        System.out.println("Distance between 3 and 10 is : " + bst.findDistance(root, 3, 10));

    }
}
