1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        HashMap<Character,Character>hm=new HashMap<>();
4        HashMap<Character,Character>mh=new HashMap<>();
5        if(s.length()!=t.length()){
6            return false;
7        }
8        for(int i=0;i<s.length();i++){
9            if(hm.containsKey(s.charAt(i))){
10                if(!hm.get(s.charAt(i)).equals(t.charAt(i))){
11                    return false;
12                }
13            }
14            else{
15                hm.put(s.charAt(i),t.charAt(i));
16            }
17            if(mh.containsKey(t.charAt(i))){
18                if(!mh.get(t.charAt(i)).equals(s.charAt(i))){
19                    return false;
20                }
21            }
22            else{
23                mh.put(t.charAt(i),s.charAt(i));
24            }
25        }
26        return true;
27
28        
29    }
30}