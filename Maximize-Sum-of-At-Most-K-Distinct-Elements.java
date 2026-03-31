1class Solution {
2    public int[] maxKDistinct(int[] nums, int k) {
3        HashSet<Integer> hm=new HashSet<>();
4        for(int i=0;i<nums.length;i++){
5            hm.add(nums[i]);
6        }
7        ArrayList<Integer>arr=new ArrayList<>();
8        for(int i:hm){
9        arr.add(i);
10        }
11       Collections.sort(arr,Collections.reverseOrder());
12       int min=Math.min(k,arr.size());
13        int arr1[]=new int[min];
14        for(int i=0;i<min;i++){
15            arr1[i]=arr.get(i);
16        }
17        return arr1;
18        
19    }
20}