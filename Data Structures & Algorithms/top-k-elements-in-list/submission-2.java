class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyHash = new HashMap<>();
        List<Integer> freq[] = new List[nums.length + 1];
        for(int i = 0; i < freq.length; ++i) {
            freq[i] = new ArrayList<>();
        }

        for(int n : nums) {
            frequencyHash.put(n, frequencyHash.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry: frequencyHash.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for(int i = freq.length - 1; i >= 0; --i) {
            for(int n: freq[i]) {
                result[index++] = n;
                if(index == k) {
                    return result;
                }
            }
        }

        return result;
    }
}
