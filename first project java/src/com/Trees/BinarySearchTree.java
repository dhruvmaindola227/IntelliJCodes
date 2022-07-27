package com.Trees;

public class BinarySearchTree {
    public static int size = 1;
    public static BstNode rootNode = null;
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        rootNode = new BstNode(5, null , null);
        bst.addNode(3,rootNode);
        bst.addNode(0,rootNode);
        bst.addNode(4, rootNode);
        bst.addNode(7, rootNode);
        bst.addNode(6, rootNode);
        bst.addNode(8 , rootNode);
        System.out.println("Inorder traversal of the tree now");
        printInOrderTraversal(rootNode);
        bst.deleteNode(4 , rootNode);
        bst.deleteNode(0 , rootNode);
//        bst.deleteNode(3 , rootNode);
        bst.deleteNode(5, rootNode);
        System.out.println("Inorder traversal of the tree now");
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

    public void deleteNode(int value , BstNode node){
        if(node == null){
            return;
        }
        //HAVE TO ADD findSuccessor() code..
        //NOT DONE YET.
        if(value < node.value){
            deleteNode(value , node.left);
        }else if(value > node.value){
            deleteNode(value , node.right);
        }

        if(node.value == value && node.left == null && node.right == null){ //leaf node.
            node.value = -1;
            return;
        }

        if(node.value == value && node.left != null && node.right != null){
            int temp = node.left.value; //inorder predecessor
            node.left.value = node.value;
            node.value = temp;
            node.left = null;
            return;
        }

        if(node.value == value){ //case with a node having only 1 child.
            BstNode newNode = node.left == null? node.right : node.left;
             //swap the values
                int temp = newNode.value;
                newNode.value = node.value;
                node.value = temp;
                node.left = null;
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
