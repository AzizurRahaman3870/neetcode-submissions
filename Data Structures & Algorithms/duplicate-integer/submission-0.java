class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> frequencyHash = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(frequencyHash.containsKey(nums[i])) {
                return true;
            } else {
                frequencyHash.put(nums[i], 1);
            }
        }

        return false;
    }
}