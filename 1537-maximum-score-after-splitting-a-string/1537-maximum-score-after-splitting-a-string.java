class Solution {
    public int maxScore(String s) {
        int ans = 0, zeros = 0, ones = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') ones++;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') zeros++;
            if (s.charAt(i) == '1') ones--;
            ans = Math.max(ans, zeros + ones);
        }

        return ans;
    }
}