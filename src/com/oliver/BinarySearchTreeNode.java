package com.oliver;

public class BinarySearchTreeNode<T extends Comparable<T>> {

    private T data;
    private BinarySearchTreeNode<T> left;
    private BinarySearchTreeNode<T> right;

    BinarySearchTreeNode(T data) {

        this.data = data;
        left = right = null;
    }

    public T getData() {

        return data;
    }

    public void setData(T data) {

        this.data = data;
    }

    public BinarySearchTreeNode<T> getLeft() {

        return left;
    }

    public void setLeft(BinarySearchTreeNode<T> left) {

        this.left = left;
    }

    public BinarySearchTreeNode<T> getRight() {

        return right;
    }

    public void setRight(BinarySearchTreeNode<T> right) {

        this.right = right;
    }
}
