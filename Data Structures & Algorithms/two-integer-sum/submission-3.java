class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> arrayHash = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            arrayHash.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            Integer currentVal = arrayHash.containsKey(difference) ? arrayHash.get(difference) : null;

            if(currentVal != null && currentVal != i) {
                return new int[]{i, currentVal};
            }
        }

        return new int[]{-1,-1};
    }
}
