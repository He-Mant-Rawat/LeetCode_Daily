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
17    public int minimumOperations(TreeNode root) {
18      if (root == null) return 0;
19
20        Queue<TreeNode> q = new LinkedList<>();
21        int count = 0;
22
23        q.offer(root);
24
25        while (!q.isEmpty()) {
26            int size = q.size();
27            ArrayList<Integer> arr = new ArrayList<>();
28
29            // collect one level
30            for (int i = 0; i < size; i++) {
31                TreeNode node = q.poll();
32                arr.add(node.val);
33
34                if (node.left != null) q.offer(node.left);
35                if (node.right != null) q.offer(node.right);
36            }
37            count += minSwaps(arr);
38        }
39
40        return count;
41    }
42
43    private int minSwaps(ArrayList<Integer> arr) {
44        int n = arr.size();
45        int swaps = 0;
46
47        int[][] temp = new int[n][2];
48        for (int i = 0; i < n; i++) {
49            temp[i][0] = arr.get(i);
50            temp[i][1] = i;
51        }
52
53        Arrays.sort(temp, (a, b) -> a[0] - b[0]);
54
55        boolean[] visited = new boolean[n];
56
57        for (int i = 0; i < n; i++) {
58            if (visited[i] || temp[i][1] == i) continue;
59
60            int cycle = 0;
61            int j = i;
62
63            while (!visited[j]) {
64                visited[j] = true;
65                j = temp[j][1];
66                cycle++;
67            }
68
69            if (cycle > 1) swaps += (cycle - 1);
70        }
71
72        return swaps;
73    }
74}