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
17    public boolean isSameTree(TreeNode p, TreeNode q) {
18        return same(p,q);
19        
20    }
21    public boolean same(TreeNode p,TreeNode q){
22        if(p==null && q==null){
23            return true;
24        }
25        if(p==null || q==null){
26            return false;
27        }
28        
29        if(p.val!=q.val){
30            return false;
31        }
32        if(p.val!=q.val){
33            return false;
34        }
35         return same(p.left,q.left) && same(p.right,q.right);
36    }
37       
38    
39}