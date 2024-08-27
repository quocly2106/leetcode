/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package balanced.binary.tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) 
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
       return height(root) != -1;
    }
    public int height(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftHeight = height(node.left);
        if(leftHeight == -1){
            return -1;
        }
        int rightHeight = height(node.right);
        if(rightHeight == -1){
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);

        BalancedBinaryTree solution = new BalancedBinaryTree();
        System.out.println(solution.isBalanced(root));
    }
    
}
