package com.oliver;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree<Integer> mTree = new BinarySearchTree<Integer>();

        mTree.insert(1);
        mTree.insert(4);
        mTree.insert(2);
        mTree.insert(3);
        mTree.insert(11);
        mTree.insert(12);
        mTree.insert(10);
        mTree.insert(9);
        mTree.insert(8);
        mTree.insert(7);
        mTree.insert(6);
        mTree.insert(7);

        mTree.printInOrder(mTree.getRoot());

        BSTAuthenticator<Integer> bstA = new BSTAuthenticator<Integer>();
        System.out.println("\nIs the tree a BST: " + bstA.authenticate(mTree));

        mTree.getRoot().setData(13);
        mTree.printInOrder(mTree.getRoot());
        System.out.println("\nAfter purposefully destroying the BST is the tree a BST: " + bstA.authenticate(mTree));
    }
}
