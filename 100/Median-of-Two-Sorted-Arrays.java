1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int n = nums1.length;
4        int m = nums2.length;
5
6        
7        int[] merged = new int[n + m];
8        int k = 0;
9        for (int i = 0; i < n; i++) {
10            merged[k++] = nums1[i];
11        }
12        for (int i = 0; i < m; i++) {
13            merged[k++] = nums2[i];
14        }
15
16        
17        Arrays.sort(merged);
18
19        
20        int total = merged.length;
21
22        if (total % 2 == 1) {
23           
24            return (double) merged[total / 2];
25        } else {
26           
27            int middle1 = merged[total / 2 - 1];
28            int middle2 = merged[total / 2];
29            return ((double) middle1 + (double) middle2) / 2.0;
30        }
31    }
32}