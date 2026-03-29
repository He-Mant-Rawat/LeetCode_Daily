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
17    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
18        return merge(root1,root2);
19    }
20    public TreeNode merge(TreeNode root1,TreeNode root2){
21        if(root1==null && root2 ==null){
22            return null;
23        }
24        if(root1==null && root2!=null){
25            return root2;
26        }
27        if(root1!=null && root2==null){
28            return root1;
29        }
30        TreeNode sum=new TreeNode(root1.val+ root2.val);
31        sum.left=merge(root1.left,root2.left);
32        sum.right=merge(root1.right,root2.right);
33        return sum;
34    }
35}