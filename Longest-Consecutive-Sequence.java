1class Solution {
2    public int longestConsecutive(int[] nums) {
3        if(nums.length==0){
4            return 0;
5        }
6      
7        int count=1;
8        int max=1;
9        HashSet<Integer>h=new HashSet<>();
10        for(int i=0;i<nums.length;i++){
11            h.add(nums[i]);
12        }
13        int nums1[]=new int[h.size()];
14        int m=0;
15        for(int i:h){
16            nums1[m++]=i;
17        }
18        Arrays.sort(nums1);
19        int l=0;
20         for(int i=0;i<nums1.length-1;i++){
21            if(nums1[i+1]==nums1[i]+1){
22                count++;
23            }
24            else{
25                count=1;
26            }
27             max=Math.max(count,max);
28        
29
30        }
31        return max;
32        
33    }
34}