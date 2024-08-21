package Tree;

import Tree.BinarySearchTree.Node;

public class main {
    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(50);
        bt.insert(30);
        bt.insert(70);
        bt.insert(60);
        bt.insert(10);
        bt.insert(90);
        System.out.println("InOrderTraversal");
        bt.inOrderTraversal(bt.root);
        System.out.println(" \nPreOrderTraversal");
        bt.preOrderTraversal(bt.root);
        System.out.println("\nPostOrderTraversal");
        bt.postOrderTraversal(bt.root);
    }
}
