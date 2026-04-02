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
17    public List<Double> averageOfLevels(TreeNode root) {
18        List<Double> l= new ArrayList<>();
19        Queue<TreeNode> q=new LinkedList<>();
20        q.offer(root);
21        while(!q.isEmpty()){
22            int size=q.size();
23             double sum=0;
24            for(int i=0;i<size;i++){
25                TreeNode node=q.poll();
26                sum=sum+node.val;
27                if(node.left!=null ){
28                    q.offer(node.left);
29                }
30                  if(node.right!=null ){
31                    q.offer(node.right);
32                }
33            }
34            l.add(sum/size);
35        }
36        return l;
37        
38    }
39}