1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        ArrayList<Integer>nums=new ArrayList<>();
4        for(int i=0;i<m;i++){
5            nums.add(nums1[i]);
6        }
7        for(int i=0;i<n;i++){
8            nums.add(nums2[i]);
9        }
10        Collections.sort(nums);
11        for(int i=0;i<nums1.length;i++){
12            nums1[i]=nums.get(i);
13        }
14
15        
16    }
17}