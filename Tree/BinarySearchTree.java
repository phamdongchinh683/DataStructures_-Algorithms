package Tree;

public class BinarySearchTree {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        } else {
            Node current = root, parent = null;
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node minNode(Node root) {
        if (root.left != null)
            return minNode(root.left);
        else
            return root;
    }

    public Node deleteNode(Node node, int value) {
        if (node == null) {
            return null;
        } else {
            if (value < node.data)
                node.left = deleteNode(node.left, value);

            else if (value > node.data)
                node.right = deleteNode(node.right, value);

            else {
                if (node.left == null && node.right == null)
                    node = null;

                else if (node.left == null) {
                    node = node.right;
                }

                else if (node.right == null) {
                    node = node.left;
                }

                else {
                    Node temp = minNode(node.right);
                    node.data = temp.data;
                    node.right = deleteNode(node.right, temp.data);
                }
            }
            return node;
        }
    }

    public void inOrderTraversal(Node node) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        } else {

            if (node.left != null)
                inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            if (node.right != null)
                inOrderTraversal(node.right);
        }
    }

    public void preOrderTraversal(Node node) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        } else {
            System.out.print(node.data + " ");
            if (node.left != null)
                preOrderTraversal(node.left);
            if (node.right != null)
                preOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(Node node) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        } else {
            if (node.left != null)
                postOrderTraversal(node.left);
            if (node.right != null)
                postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

}
