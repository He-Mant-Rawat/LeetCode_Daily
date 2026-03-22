1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        String words[]=s.split(" ");
4        if(pattern.length()!=words.length){
5            return false;
6        }
7        HashMap<Character,String>hm=new HashMap<>();
8        HashMap<String,Character>mh=new HashMap<>();
9        for(int i=0;i<pattern.length();i++){
10            if(hm.containsKey(pattern.charAt(i))){
11                if(!hm.get(pattern.charAt(i)).equals(words[i])){
12                    return false;
13                }
14            }
15            else{
16                    hm.put(pattern.charAt(i),words[i]);
17                }
18            if(mh.containsKey(words[i])){
19                if(!mh.get(words[i]).equals(pattern.charAt(i))){
20                    return false;
21                }
22            }
23            else{
24                    mh.put(words[i],pattern.charAt(i));
25                }
26
27        }
28        return true;
29        
30
31    }
32} 