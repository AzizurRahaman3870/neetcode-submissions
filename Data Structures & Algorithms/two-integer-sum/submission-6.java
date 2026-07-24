class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> arrayHash = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if(arrayHash.containsKey(difference)) {
                return new int[]{arrayHash.get(difference), i};
            }
            
            arrayHash.put(nums[i], i);
        }

        return new int[]{-1,-1};
    }
}
