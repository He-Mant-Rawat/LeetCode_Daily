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
17    public boolean hasPathSum(TreeNode root, int targetSum) {
18        if(root==null){
19            return false;
20        }
21        Stack<TreeNode>path=new Stack<>();
22        Stack<Integer>sumPath=new Stack<>();
23        path.push(root);
24        sumPath.push(root.val);
25        while(!path.isEmpty()){
26            TreeNode temp=path.pop();
27            int tempVal=sumPath.pop();
28            if(temp.left==null && temp.right==null && tempVal==targetSum){
29                return true;
30            }
31            if(temp.right!=null){
32                path.push(temp.right);
33                sumPath.push(temp.right.val+tempVal);
34            }
35            if(temp.left!=null){
36                path.push(temp.left);
37                sumPath.push(temp.left.val+tempVal);
38            }
39        }
40        return false;
41
42        
43    }
44}