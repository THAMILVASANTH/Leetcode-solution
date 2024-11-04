class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i = left; i <= right; i++) {
            count +=  isVowel(words[i].charAt(0)) &&  isVowel(words[i].charAt(words[i].length() - 1)) ? 1 : 0;
        }
        return count;
    }

    boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}