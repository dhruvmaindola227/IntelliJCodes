package com.Trees;

public class BinarySearchTree {
    public static int size = 1;
    public static BstNode rootNode = null;
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        rootNode = new BstNode(40, null , null);
        bst.addNode(20,rootNode);
        bst.addNode( 60, rootNode);
        bst.addNode(10 , rootNode);
        bst.addNode(30, rootNode);
        bst.addNode(50, rootNode);
        bst.addNode(70, rootNode);
        bst.addNode(25 , rootNode);

        System.out.println("Inorder traversal of the tree now");
        printInOrderTraversal(rootNode);
        System.out.println("does exist? -> " + doesExist(3 , rootNode));
        bst.deleteNode(4 , rootNode);
        bst.deleteNode(2 , rootNode);
        bst.deleteNode(3 , rootNode);
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
            System.out.println(node.value + " deleted");
            node.value = -1;
            return;
        }

        if(node.value == value && node.left != null && node.right != null){
            System.out.println(node.value + " deleted");
            node.value = findSuccessor(node.left); //inorder predecessor
            node.left.value = -1;
            return;
        }

        if(node.value == value){ //case with a node having only 1 child.
            BstNode newNode = node.left == null ? node.right : node.left;
            System.out.println(node.value + " deleted");
             //swap the values
                int temp = newNode.value;
                newNode.value = node.value;
                node.value = temp;
                newNode.value= -1;
        }
    }

    public static boolean doesExist(int value , BstNode node){
        if(node == null){
            return false;
        }
        if(node.value == value){
            return true;
        }
        if(node.value < value){
            return doesExist(value , node.right);
        }
        else return doesExist(value , node.left);
    }

    private int findSuccessor(BstNode node) {
        if(node == null){
            return 0;
        }
        return Math.max(node.value, Math.max(findSuccessor(node.left) , findSuccessor(node.right)));

    }

    public static void printInOrderTraversal(BstNode rootNode){
        if(rootNode == null){
            System.out.println();
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
