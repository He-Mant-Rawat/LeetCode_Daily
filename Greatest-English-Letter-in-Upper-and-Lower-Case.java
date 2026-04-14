1class Solution {
2    public String greatestLetter(String s) {
3         HashSet<Character> set = new HashSet<>();
4        for(char ch : s.toCharArray()){
5            set.add(ch);
6        }
7        for(char ch = 'Z'; ch >= 'A'; ch--){
8            if(set.contains(ch) && set.contains(Character.toLowerCase(ch))){
9                return String.valueOf(ch);
10            }
11        }
12
13        return "";
14    }
15}