1class Solution {
2    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
3        int count=0;
4        for(int i=0;i<hours.length;i++){
5            if(hours[i]>=target){
6                count++;
7            }
8        }
9        return count;
10        
11    }
12}