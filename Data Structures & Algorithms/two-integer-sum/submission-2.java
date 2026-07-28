class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int difference = target - nums[i];
            if(m.containsKey(difference)){
                int[] arr = {m.get(difference),i};
                return arr;
            }
            m.put(nums[i],i);
        }
        return null;
    } 
}
