1class Solution {
2    public int compress(char[] nums) {
3        StringBuilder s=new StringBuilder();
4        int count=1;
5        for(int i=0;i<nums.length;i++){
6            if( i<nums.length-1 && nums[i]==nums[i+1]){
7                count++;
8            }
9            else{
10                s.append(nums[i]);
11                if(count>1){
12                    s.append(count);
13                }
14                 count=1;
15            } 
16        }
17         for(int j=0;j<s.length();j++){
18            nums[j]=s.charAt(j);
19        }
20        return s.length();
21      
22    }
23}