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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>>nums=new ArrayList<>();
19        Queue<TreeNode>pq=new LinkedList<>();
20        if(root==null){
21            return nums;
22        }
23        pq.offer(root);
24        while(!pq.isEmpty()){
25            int size=pq.size();
26             ArrayList<Integer>arr=new ArrayList<>();
27            for(int i=0;i<size;i++){
28                TreeNode node=pq.poll();
29                 arr.add(node.val);
30            if(node.left!=null  ){
31               pq.offer(node.left);
32            }
33            if(node.right!=null){
34                pq.offer(node.right);
35            }
36            }
37            nums.add(arr);
38        } 
39        return nums;   
40
41    }
42}