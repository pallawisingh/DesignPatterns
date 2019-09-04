package com.datastructure.bst;

public class BSTOperations {

    public BSTNode insert(BSTNode bstNode, int data) {
        if (bstNode == null) {
            bstNode = new BSTNode(data);
            return bstNode;
        }
        if (data < bstNode.getData()) {
            bstNode.left = insert(bstNode.getLeft(), data);
        } else if (data > bstNode.getData()) {
            bstNode.right = insert(bstNode.getRight(), data);
        }
        return bstNode;
    }

    public BSTNode find(BSTNode bstNode, int data) {
        if (bstNode == null) {
            return null;
        }
        if (data < bstNode.getData()) {
            return find(bstNode.getLeft(), data);
        } else if (data > bstNode.getData()) {
            return find(bstNode.getRight(), data);
        }
        return bstNode;
    }

    public BSTNode findMin(BSTNode bstNode) {
        if (bstNode == null) {
            return null;
        }
        if (bstNode.getLeft() == null) {
            return bstNode;
        } else
            return findMin(bstNode.getLeft());
    }

    public BSTNode findMax(BSTNode bstNode) {
        if (bstNode == null) {
            return null;
        }
        if (bstNode.getRight() == null) {
            return bstNode;
        } else
            return findMax(bstNode.getRight());
    }

    public BSTNode delete(BSTNode bstNode, int data) {
        BSTNode temp;
        if (bstNode == null) {
            return null;
        }
        if (bstNode.getRight() == null && bstNode.getLeft() == null) {
            bstNode = null;
        }
        if (data < bstNode.getData()) {
            bstNode.left = delete(bstNode.getLeft(), data);
        } else if (data > bstNode.getData()) {
            bstNode.right = delete(bstNode.getRight(), data);
        } else {
            if (bstNode.getLeft() != null && bstNode.getRight() != null) {
                temp = findMax(bstNode.getLeft());
                bstNode.data = temp.getData();
                bstNode.left = delete(bstNode.getLeft(), bstNode.getData());
            } else {
                if (bstNode.getLeft() == null)
                    bstNode = bstNode.getRight();
                if (bstNode.getRight() == null)
                    bstNode = bstNode.getLeft();

            }
        }
        return bstNode;
    }

    public void decode(){
        String S="1001011";



    }
}
