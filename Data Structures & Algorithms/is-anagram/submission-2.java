class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) -'a']++; // So, for example charAt(i) gives c, it will be c - a, which will be converted to ascii, which will result in 99-97, which will result in index 2. 
            count[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < count.length; i++){
            if(count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
