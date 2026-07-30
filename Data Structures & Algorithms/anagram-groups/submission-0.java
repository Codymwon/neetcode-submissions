class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if(visited[i]){
                continue;
            }

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i]=true;

            for (int j = i + 1; j < strs.length; j++) {

                if(visited[j]){
                    continue;
                }

                if (!(strs[i].length() == strs[j].length())) {
                    continue;
                }

                Hashtable<Character, Integer> freqS = new Hashtable<>();
                Hashtable<Character, Integer> freqT = new Hashtable<>();

                for (char s1 : strs[i].toCharArray()) {
                    if (freqS.containsKey(s1)) {
                        freqS.put(s1, freqS.get(s1) + 1);
                    } else {
                        freqS.put(s1, 1);
                    }
                }

                for (char t1 : strs[j].toCharArray()) {
                    if (freqT.containsKey(t1)) {
                        freqT.put(t1, freqT.get(t1) + 1);
                    } else {
                        freqT.put(t1, 1);
                    }
                }

                if (freqS.equals(freqT)) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            if (!group.isEmpty()) {
                result.add(group);
            }
        }

        return result;
    }
}