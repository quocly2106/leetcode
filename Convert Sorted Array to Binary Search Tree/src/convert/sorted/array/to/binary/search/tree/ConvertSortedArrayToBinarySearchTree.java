/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convert.sorted.array.to.binary.search.tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left = helper(nums, left, mid - 1);
        node.right = helper(nums, mid + 1, right);
        
        return node;
    }
    private void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left); 
            System.out.print(root.val + " "); 
            inorderTraversal(root.right);
        }
    }
    public static void main(String[] args) {
        ConvertSortedArrayToBinarySearchTree solution = new ConvertSortedArrayToBinarySearchTree();
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = solution.sortedArrayToBST(nums);
        solution.inorderTraversal(root);
    }
    
}
