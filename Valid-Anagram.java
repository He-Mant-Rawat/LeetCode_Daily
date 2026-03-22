1class Solution {
2    public boolean isAnagram(String s, String t) {
3        char c[]=s.toCharArray();
4        char p[]=t.toCharArray();
5        Arrays.sort(c);
6        Arrays.sort(p);
7        if(c.length!=p.length){
8            return false;
9        }
10        for(int i=0;i<c.length;i++){
11            if(c[i]!=p[i]){
12                return false;
13            }
14        }
15        return true;
16        
17    }
18}