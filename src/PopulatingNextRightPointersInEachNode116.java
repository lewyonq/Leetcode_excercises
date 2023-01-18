/*
You are given a perfect binary tree where all leaves are on the same level,
and every parent has two children. The binary tree has the following definition:

Populate each next pointer to point to its next right node.
If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.
 */
public class PopulatingNextRightPointersInEachNode116 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node connectedRoot = connect(root);
    }

    static Node connect(Node root) {
        dfs(root, null);
        return root;
    }

    static void dfs(Node current, Node next) {
        if(current == null) {
            return;
        }

        current.next = next;

        dfs(current.left, current.right);
        dfs(current.right, current.next == null ? null : current.next.left);
    }

    // from leetcode:
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node left, Node right, Node next) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.next = next;
        }
    }
}
