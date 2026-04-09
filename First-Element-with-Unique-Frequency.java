1class Solution {
2    public int firstUniqueFreq(int[] nums) {
3       HashMap<Integer, Integer> freqMap = new HashMap<>();
4        for (int num : nums) {
5            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
6        }
7        HashMap<Integer, Integer> freqCount = new HashMap<>();
8        for (int freq : freqMap.values()) {
9            freqCount.put(freq, freqCount.getOrDefault(freq, 0) + 1);
10        }
11        for (int num : nums) {
12            int freq = freqMap.get(num);
13            if (freqCount.get(freq) == 1) {
14                return num;
15            }
16        }
17
18        return -1;
19
20        
21    }
22}