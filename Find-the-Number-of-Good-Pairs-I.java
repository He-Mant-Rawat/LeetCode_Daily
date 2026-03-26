1class Solution {
2    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
3        int count=0;
4        int n=nums1.length;
5        int m=nums2.length;
6        for(int i=0;i<n;i++){
7            for(int j=0;j<m;j++){
8                if(nums1[i]%(nums2[j]*k)==0){
9                count++;
10                }
11            }
12        }
13        return count;
14        
15    }
16}