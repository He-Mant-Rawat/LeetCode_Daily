1class Solution {
2    public void rotate(int[] nums, int k) {
3         k=k%nums.length;
4        int m=0;
5        int arr[]=new int[nums.length];
6        for(int i=nums.length-k;i<nums.length;i++){
7            arr[m++]=nums[i];
8
9        }
10        for(int i=0;i<nums.length-k;i++){
11            arr[m++]=nums[i];
12        }
13        for(int i=0;i<nums.length;i++){
14          nums[i]=arr[i];
15        }
16       
17        
18    }
19}