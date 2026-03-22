1class Solution {
2    public List<String> findAndReplacePattern(String[] words, String pattern) {
3         List<String> result = new ArrayList<>();
4
5        for (String word : words) {
6            if (matches(word, pattern)) {
7                result.add(word);
8            }
9        }
10
11        return result;
12    }
13
14    private boolean matches(String word, String pattern) {
15        HashMap<Character, Character> map1 = new HashMap<>();
16        HashMap<Character, Character> map2 = new HashMap<>();
17
18        for (int i = 0; i < word.length(); i++) {
19            char w = word.charAt(i);
20            char p = pattern.charAt(i);
21            if (map1.containsKey(p)) {
22                if (map1.get(p) != w) return false;
23            } else {
24                map1.put(p, w);
25            }
26            if (map2.containsKey(w)) {
27                if (map2.get(w) != p) return false;
28            } else {
29                map2.put(w, p);
30            }
31        }
32
33        return true;
34    }
35}