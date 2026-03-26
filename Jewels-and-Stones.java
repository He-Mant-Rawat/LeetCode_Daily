1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        
4        HashMap<Character,Integer>hm=new HashMap<>();
5        for(int i=0;i<stones.length();i++){
6            hm.put(stones.charAt(i),hm.getOrDefault(stones.charAt(i),0)+1);
7        }
8        int sum=0;
9        for(int i=0;i<jewels.length();i++){
10            if(hm.containsKey(jewels.charAt(i))){
11                sum=sum+hm.get(jewels.charAt(i));
12            }
13        }
14        return sum;
15    }
16}