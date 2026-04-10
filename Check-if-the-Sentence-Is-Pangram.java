1class Solution {
2    public boolean checkIfPangram(String s) {
3      
4
5       int[] arr = new int[26];
6
7       for (int i = 0; i < s.length(); i++) {
8          char ch = s.charAt(i);
9          arr[ch - 'a']++;
10        }
11        for(int i=0;i<arr.length;i++){
12            if(arr[i]==0){
13                return false;
14            }
15        }
16        return true;
17
18    }
19}