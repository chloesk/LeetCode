class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int w1 = word1.length();
        int w2 = word2.length();
      
        for (int i = 0; i < w1 || i < w2; ++i) {
            if(i < w1) {
                str.append(word1.charAt(i));
            }
            if(i < w2) {
                str.append(word2.charAt(i));
            }
        }
        return str.toString();
        
    }
}

