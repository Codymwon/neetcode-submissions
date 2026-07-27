
class Solution {
    HashSet<Integer> temp = new HashSet<>();
    public boolean hasDuplicate(int[] nums) {
        boolean value = false;
        for (Integer i : nums){
            if(!temp.contains(i)){
                temp.add(i);
            }
            else {
                value = true;
                break;
            }
        }
        return value;
    } 
}