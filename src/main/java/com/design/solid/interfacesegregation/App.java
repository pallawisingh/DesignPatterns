package com.design.solid.interfacesegregation;

public class App {

    public static void main(String[] args) {

        Tree binarySearchTree = new BinarySearchTree();
        BalancedTree balancedTree = new BalancedTree();

        System.out.println(binarySearchTree.findMax());
        balancedTree.rightRotation();
    }
}
