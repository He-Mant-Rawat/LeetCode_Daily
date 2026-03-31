1class Solution {
2    public boolean partitionArray(int[] nums, int k) {
3        int n=nums.length;
4        if(n%k!=0){
5            return false;
6        }
7        HashMap<Integer,Integer>hm=new HashMap<>();
8        for(int i=0;i<nums.length;i++){
9            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
10        }
11        int g=n/k;
12        for(int i:hm.keySet()){
13            if(hm.get(i)>g){
14                return false;
15            }
16        }
17        return true;
18    }
19}