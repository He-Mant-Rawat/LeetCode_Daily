1class Solution {
2    public int[] findArray(int[] pref) {
3        if(pref.length==1){
4            return pref;
5        }
6        int xm=pref[0];
7        int arr[]=new int[pref.length];
8        for(int i=1;i<pref.length;i++){
9            arr[0]=pref[0];
10            xm= pref[i]^pref[i-1];
11            arr[i]=xm;
12        }
13        return arr;
14        
15    }
16}