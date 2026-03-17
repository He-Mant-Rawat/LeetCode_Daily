1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int totGas=0;
4        int totCost=0;
5        for(int val:gas){
6            totGas+=val;
7        }
8        for(int val:cost){
9            totCost+=val;
10        }
11        if(totGas<totCost){
12            return -1;
13        }
14        int start=0;
15         int currGas=0;
16        for(int i=0;i<gas.length;i++){
17            currGas+=(gas[i]-cost[i]);
18            if(currGas<0){
19                start=i+1;
20                currGas=0;
21            }
22        }
23        return start;
24
25        
26    }
27}