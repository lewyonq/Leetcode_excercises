/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 */

import java.util.ArrayList;
import java.util.List;

public class SymmetricTree101 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(3);

        System.out.println(isSymmetric(root));
    }

    //shorter recursive
    static boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }

        return checkSymmetric(root.left, root.right);
    }

    static boolean checkSymmetric(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return root1 == root2;
        }

        if(root1.val != root2.val) {
            return false;
        }

        return checkSymmetric(root1.left, root2.right) && checkSymmetric(root1.right, root2.left);
    }

}

// if inorderTraverse = postOrderTraverse it's symmetric
//    static boolean isSymmetric(TreeNode root) {
//        if (inorderTraversal(root).equals(postorderTraversal(root))) {
//            return true;
//        }
//
//        return false;
//    }
//
//    static List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> inorderTree = new ArrayList<>();
//        inorderTraverse(root, inorderTree);
//
//        return inorderTree;
//    }
//
//    static void inorderTraverse(TreeNode root, List<Integer> list) {
//        if(root == null) {
//            return;
//        }
//
//        inorderTraverse(root.left, list);
//        list.add(root.val);
//        inorderTraverse(root.right, list);
//    }
//
//    static List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> postorderTree = new ArrayList<>();
//        postorderTraverse(root, postorderTree);
//
//        return postorderTree;
//    }
//
//    static void postorderTraverse(TreeNode root, List<Integer> list) {
//        if(root == null) {
//            return;
//        }
//
//        postorderTraverse(root.right, list);
//        list.add(root.val);
//        postorderTraverse(root.left, list);
//    }
