public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        // If duplicate value, return, we do not accept duplicates
        if (value == data) {
            return;
        }
        // If less than, the value being inserted will be a left child.
        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            }
            else leftChild.insert(value);
        }
        // If greater than, the value inserted will be a right child
        else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            }
            else {
                rightChild.insert(value);
            }
        }
    }

    public TreeNode get(int value) {
        if (value == data) {
            return this;
        }
        // Look for value in left subtree
        if (value < data) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        }
        // Look for value in right subtree
        else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }
        // Value could not be found in tree
        return null;
    }

    // Finding the minimum value in the binary tree
    public int min() {
        if (leftChild == null) {
            return data;
        }
        else {
            return leftChild.min();
        }
    }

    // Finding the max value in the binary tree
    public int max() {
        if (rightChild == null) {
            return data;
        }
        else {
            return rightChild.max();
        }
    }

    public void  traverseInOrder() {
        if (leftChild!= null) {
            leftChild.traverseInOrder();
        }
        System.out.print(data + ", ");
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        System.out.print(data + ", ");
        if (leftChild!= null) {
            leftChild.traversePreOrder();
        }
        if (rightChild != null) {
            rightChild.traversePreOrder();
        }
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
