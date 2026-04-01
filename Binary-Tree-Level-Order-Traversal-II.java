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
17    public List<List<Integer>> levelOrderBottom(TreeNode root) {
18        List<List<Integer>>nums=new ArrayList<>();
19        Queue<TreeNode>pq=new LinkedList<>();
20        pq.offer(root);
21        if(root==null)return nums;
22        while(!pq.isEmpty()){
23            int size=pq.size();
24            ArrayList<Integer>arr=new ArrayList<>();
25            for(int i=0;i<size;i++){
26            TreeNode node=pq.poll();
27            arr.add(node.val);
28            if(node.left!=null){
29                pq.offer(node.left);
30            }
31            if(node.right!=null){
32                pq.offer(node.right);
33            }   
34        }
35        nums.add(arr);
36        }
37        List<List<Integer>>nums1=new ArrayList<>();
38        for(int i=nums.size()-1;i>=0;i--){
39            nums1.add(nums.get(i));
40        
41        }
42        return nums1;
43        
44    }
45}