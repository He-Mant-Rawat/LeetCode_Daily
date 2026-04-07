1class Solution {
2    public int firstUniqChar(String s) {
3        HashMap<Character,Integer> HM=new HashMap<>();
4        for(int i=0;i<s.length();i++){
5           HM.put(s.charAt(i),HM.getOrDefault(s.charAt(i),0)+1);
6        }
7        for(int i=0;i<s.length();i++){
8            if(HM.get(s.charAt(i))==1){
9            return i;
10        }
11        } 
12        return -1;
13        
14    }
15}