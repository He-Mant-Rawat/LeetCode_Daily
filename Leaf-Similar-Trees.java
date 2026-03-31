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
17    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
18        ArrayList<Integer>arr=new ArrayList<>();
19        ArrayList<Integer>arr1=new ArrayList<>();
20          leaf(root1,arr);
21          leaf(root2,arr1);
22        if(arr.size()!=arr1.size()){
23            return false;
24        }
25        for(int i=0;i<arr1.size();i++){
26            if(!arr.get(i).equals(arr1.get(i))){
27                return false;
28            }
29        }
30        return true;
31       
32    }
33    public void leaf(TreeNode root,ArrayList<Integer>arr){
34        if(root==null){
35            return;
36        }
37        if(root.left==null && root.right==null){
38            arr.add(root.val);
39            return;
40        }
41         leaf(root.left,arr);
42         leaf(root.right,arr);
43    }
44}