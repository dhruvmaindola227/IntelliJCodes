package com.Trees;

public class BinarySearchTree {
    public static int size = 1;
    public static BstNode rootNode = null;
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        rootNode = new BstNode(5, null , null);
        bst.addNode(3,rootNode);
        bst.addNode(6,rootNode);
        bst.addNode(1 , rootNode);
        bst.addNode(7 , rootNode);
        bst.addNode(-234 , rootNode);
        bst.addNode(234 , rootNode);
        System.out.println("size -> " +  bst.size);
        printInOrderTraversal(rootNode);

    }

    public void addNode(int value , BstNode node){

        if(value < node.value && node.left == null){
            node.left = new BstNode(value , null , null);
            size++;
        }
        if(value > node.value && node.right == null){
            node.right = new BstNode(value , null , null);
            size++;
        }
        if(value < node.value){
            addNode(value , node.left);
        }
        if(value > node.value){
            addNode(value , node.right);
        }
    }
    public static void printInOrderTraversal(BstNode rootNode){
        if(rootNode == null){
            return;
        }
        printInOrderTraversal(rootNode.left);
        System.out.print(rootNode.value + " ");
        printInOrderTraversal(rootNode.right);
    }

}

class BstNode{
    int value;
    BstNode left;
    BstNode right;

    BstNode(){}

    public BstNode(int value, BstNode left, BstNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
