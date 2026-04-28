1class Solution {
2    public int removeElement(int[] nums, int val) {
3        ArrayList<Integer>arr=new ArrayList<>();
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]==val){
6                continue;
7            }
8            arr.add(nums[i]);
9        }
10        for(int i=0;i<arr.size();i++){
11            nums[i]=arr.get(i);
12        }
13        return arr.size();
14    }
15}