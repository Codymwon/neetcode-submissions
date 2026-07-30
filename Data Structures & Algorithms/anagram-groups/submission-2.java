class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> values = new HashMap<>();
        for(String val : strs){
            String sortedKey=sortString(val);
            if(values.containsKey(sortedKey)){
                values.get(sortedKey).add(val);
            }else{
                List<String> group = new ArrayList<>();
                group.add(val);
                values.put(sortedKey, group);
            }
        }
        return new ArrayList<>(values.values());
    }
    public static String sortString(String str) {
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
    }
}
