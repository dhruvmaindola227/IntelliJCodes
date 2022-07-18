package com.Trees;

class Node{
    int value;
    Node left;
    Node right;
}

public class BinaryTree {
    public Node createNewNode(int value){
        Node newNode = new Node();
        newNode.value = value;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }

    public static void printPreOrderTraversal(Node rootNode) {
        if(rootNode == null){
            return;
        }
        System.out.print(rootNode.value + " ");
        printPreOrderTraversal(rootNode.left);
        printPreOrderTraversal(rootNode.right);
    }

    public static void printInOrderTraversal(Node rootNode){
        if(rootNode == null){
            return;
        }
        printInOrderTraversal(rootNode.left);
        System.out.print(rootNode.value + " ");
        printInOrderTraversal(rootNode.right);
    }

    public static void printPostOrderTraversal(Node rootNode){
        if(rootNode == null){
            return;
        }
        printPostOrderTraversal(rootNode.left);
        printPostOrderTraversal(rootNode.right);
        System.out.print(rootNode.value + " ");
    }

    public static int sumOfAllNodesInBinaryTree(Node rootNode , int sum){
        if(rootNode == null){
            return 0;
        }
        return sumOfAllNodesInBinaryTree(rootNode.left , 0)
                +
                sumOfAllNodesInBinaryTree(rootNode.right , 0)
                +
                rootNode.value;
    }

    public static int numberOfNodes(Node rootNode){
        if(rootNode == null){
            return 0;
        }
        return 1 + numberOfNodes(rootNode.left) + numberOfNodes(rootNode.right);
    }

    public static int numberOfLeafNodes(Node rootNode){
        if(rootNode.left != null && rootNode.right != null){
            return numberOfLeafNodes(rootNode.left) + numberOfLeafNodes(rootNode.right);
        }

        return 1;
    }

    public static int getHeightOfBinaryTree(Node rootNode){
        if(rootNode == null){
            return -1;
        }
        return 1 + Math.max(getHeightOfBinaryTree(rootNode.left), getHeightOfBinaryTree(rootNode.right));
    }

    public static void printGivenLevel(Node rootNode , int level){
        if(rootNode == null){
            return;
        }
        if(level == 1){
            System.out.print(" "+ rootNode.value + " ");
            return;
        }
        printGivenLevel(rootNode.left , level - 1);
        printGivenLevel(rootNode.right , level - 1);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node root = bt.createNewNode(1);
        root.left = bt.createNewNode(2);
        root.left.left = bt.createNewNode(5);
        root.left.right = bt.createNewNode(4);
        root.left.right.left = bt.createNewNode(6);
        root.left.right.right = bt.createNewNode(7);
        root.right = bt.createNewNode(3);
        root.right.right = bt.createNewNode(8);
        root.right.left = bt.createNewNode(10);
        root.right.right.left = bt.createNewNode(9);
        System.out.println("PreOrder traversal of the tree -> ");
        printPreOrderTraversal(root);
        System.out.println();
        System.out.println("InOrder traversal of the tree -> ");
        printInOrderTraversal(root);
        System.out.println();
        System.out.println("PostOrder traversal of the tree -> ");
        printPostOrderTraversal(root);
        System.out.println();
        System.out.println("sum of all nodes in tree is -> ");
        System.out.println(sumOfAllNodesInBinaryTree(root , 0));
        System.out.println("Number of nodes in the tree are -> ");
        System.out.println(numberOfNodes(root));
        System.out.println("Number of leaf nodes in the tree are -> ");
        System.out.println(numberOfLeafNodes(root));
        System.out.println("Height of the tree -> ");
        System.out.println(getHeightOfBinaryTree(root));
        System.out.println("Nodes at level number 3 -> ");
        printGivenLevel(root , 3);
    }
}

