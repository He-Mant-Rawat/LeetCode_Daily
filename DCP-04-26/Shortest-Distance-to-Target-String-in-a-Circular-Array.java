1class Solution {
2    public int closestTarget(String[] words, String target, int startIndex) {
3        int count=0;
4        int min=Integer.MAX_VALUE;
5        int n=words.length;
6        for(int i=0;i<n;i++){
7            if(words[i].equals(target)){
8                int dis=Math.abs(i-startIndex);
9                int cir=n-dis;
10                dis=Math.min(dis,cir);
11                min=Math.min(dis,min);
12            }
13
14        }
15        return min==Integer.MAX_VALUE?-1:min;
16    }
17}