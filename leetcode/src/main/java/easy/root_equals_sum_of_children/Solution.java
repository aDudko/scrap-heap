package main.java.easy.root_equals_sum_of_children;

class Solution {
    public static void main(String[] args) {
        System.out.println(checkTree(new TreeNode(10,  new TreeNode(4), new TreeNode(6))));
        System.out.println(checkTree(new TreeNode(5,  new TreeNode(3), new TreeNode(1))));
    }

    public static boolean checkTree(TreeNode root) {
        if (root.left != null && root.right != null) {
            return root.left.val + root.right.val == root.val;
        }
        return false;
    }
}