package com.bporamin.tree;

/**
 * Created by FanG on 3/15/2017.
 */
public class BST {

    private Node root;

    public BST() {
        this.root = null;
    }

    public void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.print(" " + root.value);
            display(root.right);
        }
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node p, int toInsert) {
        if (p == null)
            return new Node(toInsert);

        if (toInsert == p.value)
            return p;

        if (toInsert < p.value)
            p.left = insert(p.left, toInsert);
        else
            p.right = insert(p.right, toInsert);

        return p;
    }

    public static void main(String[] args){
        BST bst = new BST();
        bst.insert(2);bst.insert(9);bst.insert(20);bst.insert(2);bst.insert(12);bst.insert(51);
        bst.display(bst.root);
    }
}
