1class Solution {
2    public int removeDuplicates(int[] nums) {
3       ArrayList<Integer>ar=new ArrayList<>();
4       for(int i=0;i<nums.length-1;i++){
5        if(nums[i]!=nums[i+1]){
6            ar.add(nums[i]);
7        }
8       }
9       ar.add(nums[nums.length-1]);
10       for(int i=0;i<ar.size();i++){
11        nums[i]=ar.get(i);
12       }
13       return ar.size();
14    }
15}