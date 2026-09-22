class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for(int i = 0; i < strs.length; ++i) {
            int count[] = new int[26];
            Arrays.fill(count, 0);

            for(char c: strs[i].toCharArray()) {
                count[c-'a']++;
            }
            
            hm.putIfAbsent(Arrays.toString(count), new ArrayList<>());
            hm.get(Arrays.toString(count)).add(strs[i]);
        }

        return new ArrayList<>(hm.values());
    }
}
