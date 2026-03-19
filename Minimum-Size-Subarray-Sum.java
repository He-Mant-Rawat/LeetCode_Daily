1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int len=Integer.MAX_VALUE;
4        int count=0;
5        int start=0;
6        int curr=0;
7        for(int i=0;i<nums.length;i++){
8            curr=curr+nums[i];
9            count++;
10            while(curr>=target){
11                len=Math.min(len,count);
12                curr=curr-nums[start];
13                count--;
14                start++;
15            }
16        }
17        return(len==Integer.MAX_VALUE)?0: len;
18
19        
20        
21    }
22}