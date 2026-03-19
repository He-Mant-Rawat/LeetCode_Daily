1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3
4        HashSet<Character>hm=new HashSet<>();
5        int l=0;
6        int r=0;
7        int maxlen=0;
8        for(r=0;r<s.length();r++){
9            while(hm.contains(s.charAt(r))){
10                hm.remove(s.charAt(l));
11                l++;
12            }
13            hm.add(s.charAt(r));
14            maxlen=Math.max(maxlen,r-l+1);
15        }
16        return maxlen;
17  }
18}