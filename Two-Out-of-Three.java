1class Solution {
2    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
3        ArrayList<Integer>arr=new ArrayList<>();
4        HashSet<Integer>h=new HashSet<>();
5        HashSet<Integer>m=new HashSet<>();
6        HashSet<Integer>k=new HashSet<>();
7        for(int i=0;i<nums1.length;i++){
8            h.add(nums1[i]);
9        }
10        for(int i=0;i<nums2.length;i++){
11            m.add(nums2[i]);
12        }
13        for(int i=0;i<nums3.length;i++){
14            k.add(nums3[i]);
15        }
16       for(int i:h){
17        arr.add(i);
18       }
19       for(int i:m){
20        arr.add(i);
21       }
22       for(int i:k){
23        arr.add(i);
24       }
25       Collections.sort(arr);
26       HashMap<Integer,Integer>hm=new HashMap<>();
27       for(int i=0;i<arr.size();i++){
28        hm.put(arr.get(i),hm.getOrDefault(arr.get(i),0)+1);
29       }
30       ArrayList<Integer>num=new ArrayList<>();
31       for(int i:hm.keySet()){
32        if(hm.get(i)>=2){
33            num.add(i);
34        }
35       }
36       return num;
37    }
38}