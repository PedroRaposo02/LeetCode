package Utils;

public class TreeNode <T> {

    public TreeNode<T> right;
    public TreeNode<T> left;
    public T value;

    public TreeNode(T value) {
        this.value = value;
    }

    public TreeNode(T value, TreeNode<T> left, TreeNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeNode() {
    }

    public TreeNode<T> getRight() {
        return this.right;
    }

    public TreeNode<T> getLeft() {
        return this.left;
    }

    public T getValue() {
        return this.value;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int getLength() {
        int length = 0;

        TreeNode<T> current = this;

        while (current != null) {
            length++;
            current = current.left;
        }

        return length;
    }
    
}
