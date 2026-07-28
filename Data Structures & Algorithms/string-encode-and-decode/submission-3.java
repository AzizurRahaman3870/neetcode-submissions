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
        int i = 0;

        while(i < str.length()) {
            int sharpIndex = str.indexOf("#", i);
            int lengthToParse = Integer.parseInt(str.substring(i, sharpIndex));

            decoded.add(str.substring(sharpIndex + 1, sharpIndex + 1 + lengthToParse));
            i = sharpIndex + 1 + lengthToParse;
        }

        return decoded;
    }
}