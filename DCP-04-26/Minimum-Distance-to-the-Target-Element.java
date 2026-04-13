1class Solution {
2    public int getMinDistance(int[] nums, int target, int start) {
3        int m=Integer.MAX_VALUE;
4        for(int i=0;i<nums.length;i++){
5            if( nums[i]==target){
6                int n=Math.abs(i-start);
7                m=Math.min(n,m);
8            }
9        }
10        return m;
11    }
12}