/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minimum.depth.of.binary.tree;

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
public class MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        int minDepth = Math.min(minDepth(root.left), minDepth(root.right))+1;
        return minDepth;
    }
    public static void main(String[] args) {
        MinimumDepthOfBinaryTree solution = new MinimumDepthOfBinaryTree();
//        TreeNode node = new TreeNode(3);
//        node.left = new TreeNode(9);
//        node.right = new TreeNode(20);
//        node.right.left = new TreeNode(15);
//        node.right.right = new TreeNode(7);
//        System.out.println(solution.minDepth(node));
        
        TreeNode node = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.right = new TreeNode(4);
        node.right.right.right = new TreeNode(5);
        node.right.right.right.right = new TreeNode(6);
        System.out.println(solution.minDepth(node));
    }
    
}
