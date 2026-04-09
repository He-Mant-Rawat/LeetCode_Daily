1class Solution {
2    public char repeatedCharacter(String s) {
3       Set<Character>hm=new HashSet<>();
4        for(int i=0;i<s.length();i++){
5            if(hm.contains(s.charAt(i))){
6                return s.charAt(i);
7            }
8            hm.add(s.charAt(i));
9        }
10        return ' ';
11        
12    }
13}