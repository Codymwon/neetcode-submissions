class Solution {
    public boolean isAnagram(String s, String t) {
        Hashtable<Character,Integer> freqS = new Hashtable<>();
        Hashtable<Character,Integer> freqT = new Hashtable<>();
        for(char s1 : s.toCharArray()){
            if(freqS.containsKey(s1)){
                freqS.put(s1, freqS.get(s1)+1);
            } else {
                freqS.put(s1,1);
            }
        }
        for(char t1 : t.toCharArray()){
            if(freqT.containsKey(t1)){
                freqT.put(t1, freqT.get(t1)+1);
            } else {
                freqT.put(t1,1);
            }
        }
        boolean value = freqS.equals(freqT);
        return value;
    }
}
