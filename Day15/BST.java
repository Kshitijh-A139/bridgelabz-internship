class INode{
    int data;
    INode left;
    INode right;

    public INode(int data) {
        this.data = data;
    }
}

class BinaryTree {
    INode root;

    public INode insert(INode root, int val) {
        if(root == null) {
            root = new INode(val);
            return root;
        }

        if(root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public void print(INode root) {
        if(root == null) {
            return;
        }
        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }

    public int size(INode root) {
        if(root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    public boolean search(INode root, int key) {
        if(root == null) {
            return false;
        }

        if(root.data == key) {
            return true;
        }

        if(root.data > key) {
            return search(root.left, key);
        }

        if(root.data < key) {
            return search(root.right, key);
        }
        return false;
    }
}

public class BST {
    public static void main(String[] args) {
        int data[] = {56, 30, 70, 22, 40, 11, 16, 3, 60, 95, 65, 67, 63};
        INode root = null;
        BinaryTree bt = new BinaryTree();
        for (int i = 0; i < data.length; i++) {
            root = bt.insert(root, data[i]);
        }

        bt.print(root);
        int size = bt.size(root);
        System.out.print("\nSize: " + size);

        System.out.print("\nIs 63 present in Binary Tree: " + bt.search(root, 63));

    }
}
