class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyHash = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for(int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for(int n: nums) {
            frequencyHash.put(n, frequencyHash.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> e: frequencyHash.entrySet()) {
            freq[e.getValue()].add(e.getKey());
        }

        ArrayList<Integer> res = new ArrayList<>();
        for(int i = freq.length - 1; i > 0; i--) {
            for(int n: freq[i]) {
                res.add(n);
                if(res.size() == k){
                    return res.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
