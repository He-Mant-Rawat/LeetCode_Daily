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
17     int xDepth=-1,yDepth=-1;
18   TreeNode xParent=null,yParent=null;
19    public boolean isCousins(TreeNode root, int x, int y) {
20    dfs(root,null,0,x,y);
21    return(xDepth==yDepth)&& (xParent!=yParent);
22   }
23   public void dfs(TreeNode node,TreeNode parent,int depth,int x,int y){
24    if(node ==null)return;
25    if(node.val==x){
26        xDepth=depth;
27        xParent=parent;
28        }
29        if(node.val==y){
30            yDepth=depth;
31            yParent=parent;
32        }
33        dfs(node.left,node,depth+1,x,y);
34        dfs(node.right,node,depth+1,x,y);
35    }
36   
37
38        
39    }
40