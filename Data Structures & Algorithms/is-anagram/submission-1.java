class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> frequencyHashS = new HashMap<>();
        HashMap<Character, Integer> frequencyHashT = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(frequencyHashS.containsKey(s.charAt(i))) {
                frequencyHashS.put(s.charAt(i), frequencyHashS.get(s.charAt(i)) + 1);
            } else {
                frequencyHashS.put(s.charAt(i), 1);
            }
        }

        for(int i = 0; i < t.length(); i++) {
            if(frequencyHashT.containsKey(t.charAt(i))) {
                frequencyHashT.put(t.charAt(i), frequencyHashT.get(t.charAt(i)) + 1);
            } else {
                frequencyHashT.put(t.charAt(i), 1);
            }
        }

        return frequencyHashS.equals(frequencyHashT);
    }
}
