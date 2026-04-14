1class Solution {
2    public int mostFrequentEven(int[] nums) {
3        HashMap<Integer,Integer>hm=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]%2==0){
6                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
7            }
8        }
9          int maxFreq = 0;
10        int ans = -1;
11
12        for(int key : hm.keySet()){
13            int freq = hm.get(key);
14
15            if(freq > maxFreq){
16                maxFreq = freq;
17                ans = key;
18            }
19            else if(freq == maxFreq){
20                ans = Math.min(ans, key);
21            }
22        }
23        return ans;
24    }
25}