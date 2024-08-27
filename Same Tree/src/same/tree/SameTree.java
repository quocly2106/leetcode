/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package same.tree;

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
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        boolean leftSame = isSameTree(p.left, q.left); 
        boolean rightSame = isSameTree(p.right, q.right);
        return leftSame && rightSame;
    }
    public TreeNode createBinaryTree(int[] array, int index) {
        if (index < array.length) {
            TreeNode node = new TreeNode(array[index]);
            node.left = createBinaryTree(array, 2 * index + 1);
            node.right = createBinaryTree(array, 2 * index + 2);
            return node;
        }
        return null;
    }
   
    public static void main(String[] args) {
        SameTree solution = new SameTree();
        int [] p = {1,2,3};
        int [] q = {1,2,3};
        TreeNode treeP = solution.createBinaryTree(p, 0);
        TreeNode treeQ = solution.createBinaryTree(q, 0);
        boolean result = solution.isSameTree(treeP, treeQ);
        System.out.println(result);
    }
    
}
