package tree.binarytree;

public class TreeTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);

        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }

    // Depth First

    /**
     * Time complexity : O(N)
     * Space complexity : O(H)
     */
    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }

    /**
     * Time complexity : O(N)
     * Space complexity : O(H)
     */
    public static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            inOrder(root.left);
            inOrder(root.right);
        }
    }

    /**
     * Time complexity : O(N)
     * Space complexity : O(H)
     */
    public static void postOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            inOrder(root.right);
            System.out.print(root.key + " ");
        }
    }

}
