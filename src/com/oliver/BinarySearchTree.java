package com.oliver;

public class BinarySearchTree<T extends Comparable<T>> {

    private BinarySearchTreeNode<T> root;

    BinarySearchTree() {

        root = null;
    }

    public void insert(T data) {

        root = insert(root, new BinarySearchTreeNode<T>(data));
    }

    private BinarySearchTreeNode<T> insert(BinarySearchTreeNode<T> node1, BinarySearchTreeNode<T> node2) {

        if(node1 == null) {
            node1 = node2;
        } else {
            if(node1.getData().compareTo(node2.getData()) >= 0) {
                node1.setLeft(insert(node1.getLeft(), node2));
            } else {
                node1.setRight(insert(node1.getRight(), node2));
            }
        }

        return node1;
    }

    public BinarySearchTreeNode<T> getRoot() {

        return root;
    }

    public void printInOrder(BinarySearchTreeNode<T> node) {

        if(node != null) {
            printInOrder(node.getLeft());
            System.out.print(node.getData() + " ");
            printInOrder(node.getRight());
        }
    }
}
