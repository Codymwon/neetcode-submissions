class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int[] result = new int[k];
        list2.add(nums[0]);
        if(nums.length==1){
            list.add(list2);
        }
        for (int i = 1; i < nums.length; i++) {
            if (list2.contains(nums[i])) {
                list2.add(nums[i]);
            } else {
                list.add(new ArrayList<>(list2));
                list2.clear();
                list2.add(nums[i]);
            }

            if ((i == nums.length - 1) && !list2.isEmpty()) {
                list.add(new ArrayList<>(list2));
            }
        }
        list.sort((a, b) -> Integer.compare(b.size(), a.size()));
        for(int i = 0; i<k; i++){
            result[i] = list.get(i).get(0);
        }
        return result;
    }
}