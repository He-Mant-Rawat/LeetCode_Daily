1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isBalanced(TreeNode root) {
18        if(root==null){
19            return true;
20        }
21        int left=height(root.left);
22        int right=height(root.right);
23        if(Math.abs(left-right)>1){
24            return false;
25        }
26            return isBalanced(root.left) && isBalanced(root.right);
27        }
28        private int height(TreeNode root){
29            if(root==null){
30                return 0;
31            }
32            return Math.max(height(root.left),height(root.right))+1;
33    
34       
35    }
36}