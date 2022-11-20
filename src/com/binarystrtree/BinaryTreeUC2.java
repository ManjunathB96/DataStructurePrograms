package com.binarystrtree;

public class BinaryTreeUC2 {
    static class Node {
        int data;
        BinaryTreeUC1.Node left;
        BinaryTreeUC1.Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static BinaryTreeUC1.Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            BinaryTreeUC1.Node newNode = new BinaryTreeUC1.Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    //preorder Traversal
    public static void preorder(BinaryTreeUC1.Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void main(String[] args) {
        int nodes[] = {56, 30, 22, 11, 3, -1, -1, 16, -1, -1, -1, 40, -1, -1, 70, 60, -1, 65, 63, -1, -1, 67, -1, -1, 95, -1, -1};
        BinaryTreeUC1.BinaryTree tree = new BinaryTreeUC1.BinaryTree();

        BinaryTreeUC1.Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        preorder(root);
    }
}



//56,30,22,11,3,-1,-1,16,-1,-1,-1,40,-1,-1,70,60,-1,65,63,-1,-1,67,-1,-1,95,-1,-1
