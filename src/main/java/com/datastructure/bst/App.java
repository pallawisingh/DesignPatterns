package com.datastructure.bst;

public class App {

    public static void main(String[] args) {
        BSTNode bstNode = null;
        BSTOperations operations = new BSTOperations();
        bstNode = operations.insert(bstNode, 6);
        bstNode = operations.insert(bstNode, 3);
        bstNode = operations.insert(bstNode, 9);
        bstNode = operations.insert(bstNode, 7);
        bstNode = operations.insert(bstNode, 4);
        bstNode = operations.insert(bstNode, 2);
        bstNode = operations.insert(bstNode, 11);
        bstNode = operations.insert(bstNode, 10);
        bstNode = operations.insert(bstNode, 12);



        System.out.println(operations.find(bstNode, 4).getData());
        System.out.println(operations.findMin(bstNode).getData());
        System.out.println(operations.findMax(bstNode).getData());
        System.out.println(operations.delete(bstNode, 9));
    }
}
