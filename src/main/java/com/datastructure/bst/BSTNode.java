package com.datastructure.bst;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BSTNode {
    public int data;
    public BSTNode left;
    public BSTNode right;

    public BSTNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
