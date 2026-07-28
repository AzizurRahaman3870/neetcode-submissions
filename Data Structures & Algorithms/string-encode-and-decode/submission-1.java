class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for(String s: strs) {
            encodedString.append(s.length());
            encodedString.append("#");
            encodedString.append(s);
        }

        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();

        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                int digitChunk = 0;
                while(str.charAt(i) != '#') {
                    digitChunk = digitChunk * 10 + (str.charAt(i) - '0');
                    i++;
                }

                i++;

                decoded.add(str.substring(i, i + digitChunk));
                i+=digitChunk-1; // -1 because i++ is part of for loop ^
            }
            
        }

        return decoded;
    }
}
