1class Solution {
2    public int minimumDistance(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                for(int k=j+1;k<nums.length;k++){
7                    if(nums[i]==nums[j]&& nums[j]==nums[k] && nums[k]==nums[i]){
8                        int p=Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
9                        min=Math.min(min,p);
10                    }
11                }
12            }
13        }
14        return min==Integer.MAX_VALUE?-1:min;
15    }
16}