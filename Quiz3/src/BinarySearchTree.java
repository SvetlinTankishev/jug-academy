class BinarySearchTree {
    private Node root;

    public boolean insert(int value) {
        if (root == null) {
            root = new Node(value);
            return true;
        } else {
            return insertNode(root, value);
        }
    }

    private boolean insertNode(Node currentNode, int value) {
        if (value == currentNode.getValue()) {
            return false;
        } else if (value < currentNode.getValue()) {
            if (currentNode.getLeft() == null) {
                currentNode.setLeft(new Node(value));
                return true;
            } else {
                return insertNode(currentNode.getLeft(), value);
            }
        } else {
            if (currentNode.getRight() == null) {
                currentNode.setRight(new Node(value));
                return true;
            } else {
                return insertNode(currentNode.getRight(), value);
            }
        }
    }

    public boolean search(int value) {
        return searchNode(root, value);
    }

    private boolean searchNode(Node currentNode, int value) {
        if (currentNode == null) {
            return false;
        } else if (value == currentNode.getValue()) {
            return true;
        } else if (value < currentNode.getValue()) {
            return searchNode(currentNode.getLeft(), value);
        } else {
            return searchNode(currentNode.getRight(), value);
        }
    }

    public java.util.List<Integer> traverse() {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }

    private void inOrderTraversal(Node currentNode, java.util.List<Integer> result) {
        if (currentNode != null) {
            inOrderTraversal(currentNode.getLeft(), result);
            result.add(currentNode.getValue());
            inOrderTraversal(currentNode.getRight(), result);
        }
    }
}

class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}