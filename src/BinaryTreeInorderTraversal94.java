/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.

 */

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal94 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = null;

        System.out.println(inorderTraversal(root));
    }

    static List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> result = new ArrayList<>();

       traverse(root, result);

       return result;
    }

    static void traverse(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }

        traverse(root.left, list);
        list.add(root.val);
        traverse(root.right, list);
    }

}
