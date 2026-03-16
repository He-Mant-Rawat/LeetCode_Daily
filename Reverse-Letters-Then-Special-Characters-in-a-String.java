1class Solution {
2    public String reverseByType(String s) {
3        ArrayList<Character>arr1=new ArrayList<>();
4        ArrayList<Character>arr2=new ArrayList<>();
5        char c[]=s.toCharArray();
6        for(int i=0;i<c.length;i++){
7            if(Character.isLowerCase(c[i])){
8                arr1.add(c[i]);
9            }else{
10                arr2.add(c[i]);
11            }
12        }
13        Collections.reverse(arr1);
14        Collections.reverse(arr2);
15        StringBuilder sc=new StringBuilder ();
16        int p=0;
17        int q=0;
18        for(int i=0;i<c.length;i++){
19            if(Character.isLowerCase(c[i])){
20                sc.append(arr1.get(p++));
21            }else{
22                sc.append(arr2.get(q++));
23
24            }
25        }
26        return sc.toString();
27    }
28}