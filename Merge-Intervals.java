1class Solution {
2    public int[][] merge(int[][] intervals) {
3         if(intervals.length<=1){
4            return intervals;
5        }
6        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
7        List<int[]> result=new ArrayList<>();
8        int[]newInterval=intervals[0];
9        result.add(newInterval);
10        for(int[]interval:intervals){
11            if(interval[0]<=newInterval[1]){
12                newInterval[1]=Math.max(newInterval[1],interval[1]);
13            }
14            else{
15                newInterval=interval;
16                result.add(newInterval);
17            }
18        }
19        return result.toArray(new int[result.size()][]);
20        
21    }
22}