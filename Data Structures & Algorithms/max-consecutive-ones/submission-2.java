class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0, current = 0;

        for (int num : nums) {
            current = (num == 1) ? current + 1 : 0;
            result = Math.max(result, current);
        }

        return result;
    }
}