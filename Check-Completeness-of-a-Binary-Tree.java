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
17    public boolean isCompleteTree(TreeNode root) {
18         Queue<TreeNode> q= new LinkedList<>();
19         q.offer(root);
20         boolean seenNull=false;
21         while(!q.isEmpty()){
22            TreeNode node=q.poll();
23            if(node==null){
24                seenNull=true;
25            }
26            else{
27                if(seenNull)return false;
28                q.offer(node.left);
29                q.offer(node.right);
30            }
31         }
32         return true;
33    }
34}