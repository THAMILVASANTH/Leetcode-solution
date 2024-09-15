class Solution {
    public int findTheLongestSubstring(String s) {

        int ans = 0;
        int xor = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                xor = xor ^ (int) ch;
            }

            if (mp.containsKey(xor)) {
                ans = Math.max(ans, (i - mp.get(xor)));
            } else {
                mp.put(xor, i);
            }

        }

        return ans;
    }
}