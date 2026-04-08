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
17    public int minDepth(TreeNode root) {
18        return mini(root);
19
20        
21    }
22    public int mini(TreeNode root){
23        if(root==null) return 0;
24        if(root.left==null){
25            return  mini(root.right)+1;
26        }
27        if(root.right==null){
28            return mini(root.left)+1;
29        }
30        int left=mini(root.left);
31        int right=mini(root.right);
32        return Math.min(left,right)+1;
33
34    }
35}