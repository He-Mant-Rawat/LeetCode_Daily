1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        HashMap<Character,Integer>hm=new HashMap<>();
4        ArrayList<Integer>arr=new ArrayList<>();
5        for(int i=0;i<p.length();i++){
6            hm.put(p.charAt(i),hm.getOrDefault(p.charAt(i),0)+1);
7        }
8        int size=hm.size();
9        int k=p.length();
10        int i=0;
11        int l=0;
12        while(l<s.length()){
13            if(hm.containsKey(s.charAt(l))){
14                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
15                if(hm.get(s.charAt(l))==0){
16                    size--;
17                }
18            }
19            if(l-i+1<k){
20                l++;
21            }
22            else if(l-i+1==k){
23                if(size==0){
24                    arr.add(i);
25                }
26                char left = s.charAt(i);
27                if(hm.containsKey(left)){
28                   hm.put(left, hm.get(left) + 1);
29                      if(hm.get(left) == 1){
30                         size++;
31                      }
32                }
33                i++;
34                l++;
35            }
36        }
37        return arr;
38      
39    }
40}