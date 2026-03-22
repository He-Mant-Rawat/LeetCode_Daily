1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int left = 1, right = 0;
4
5        for(int p : piles){
6            right = Math.max(right, p);
7        }
8
9        while(left <= right){
10            int mid = left + (right - left) / 2;
11
12            long hours = 0;
13
14            for(int p : piles){
15                hours += (p + mid - 1) / mid;
16            }
17
18            if(hours <= h){
19                right = mid - 1;
20            } else {
21                left = mid + 1;
22            }
23        }
24
25        return left;
26     
27        
28    }
29}