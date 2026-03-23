1class Solution {
2    public List<String> summaryRanges(int[] nums) {
3        ArrayList<String>arr=new ArrayList<>();
4        int i=0;
5        while(i<nums.length){
6            int start=nums[i];
7            while(i<nums.length-1 && nums[i]+1==nums[i+1]){
8                i++;
9            }
10            int end=nums[i];
11            if(start==end){
12                arr.add(String.valueOf(start));
13            }
14            else{
15                arr.add(start+"->"+end);
16
17            }
18            i++;
19        }
20        return arr;
21    }
22}