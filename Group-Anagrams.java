1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String,List<String>>hm=new HashMap<>();
4        for(String s:strs){
5            int []count=new int[26];
6            for(char c:s.toCharArray()){
7                count[c-'a']++;
8            }
9            StringBuilder sb=new StringBuilder();
10            for(int i:count){
11                sb.append('#');
12                sb.append(i);
13            }
14            String key=sb.toString();
15            if(!hm.containsKey(key)){
16                hm.put(key,new ArrayList<>());
17            }
18            hm.get(key).add(s);
19        }
20        return new ArrayList<>(hm.values());
21        
22    }
23}