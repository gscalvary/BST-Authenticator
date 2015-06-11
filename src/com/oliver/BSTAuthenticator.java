package com.oliver;

import java.util.LinkedList;
import java.util.Queue;

public class BSTAuthenticator<T extends Comparable<T>> {

    public boolean authenticate(BinarySearchTree<T> tree) {

        if(tree.getRoot() == null) return true;

        // Breadth first search visiting each node and checking that each node's left child data value is less than
        // the node's data value and each node's right data value is greater than the node's data value.
        Queue<BinarySearchTreeNode<T>> mQueue = new LinkedList<BinarySearchTreeNode<T>>();
        mQueue.offer(tree.getRoot());

        while(mQueue.size() > 0) {
            BinarySearchTreeNode<T> parent = mQueue.poll();
            BinarySearchTreeNode<T> left = parent.getLeft();
            BinarySearchTreeNode<T> right = parent.getRight();
            if(left != null) {
                if(parent.getData().compareTo(left.getData()) < 0) {
                    System.out.println("\n" + parent.getData() + " < left child " + left.getData());
                    return false;
                }
                mQueue.offer(left);
            }
            if(right != null) {
                if(parent.getData().compareTo(right.getData()) > 0) {
                    System.out.println("\n" + parent.getData() + " > right child " + right.getData());
                    return false;
                }
                mQueue.offer(right);
            }
        }

        return true;
    }
}
