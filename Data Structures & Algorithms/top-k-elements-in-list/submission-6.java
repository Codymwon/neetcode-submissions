class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap();
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
        for(int i : nums){
            if(freq.containsKey(i)){
                freq.put(i,freq.get(i)+1);
            }else {
                freq.put(i,1);
            }
        }
        for(int j : freq.keySet()){
            int frequency = freq.get(j);
            if(bucket[frequency]==null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(j);
        }
        int[] ans = new int[k];
        int idx = 0;
        for(int i = bucket.length-1; i>=0 && idx < k; i--){
            if(bucket[i]!=null){
                for(int z : bucket[i]){
                    ans[idx] = z;
                    idx++;
                    if (idx == k)
                        break;
                }
            }
        }
        return ans;
    }
}
