class Solution {
    public int findKthNumber(int n, int k) {
        int c= 1;
        k--;

        while (k > 0) {
            int count = countPrefix(c, n);
            if (count <= k) {
                c++;
                k -= count;
            } else {
                c*= 10;
                k--;
            }
        }
        return c;
    }

    private int countPrefix(int prefix, int n) {
        long cur = prefix;
        long next = prefix + 1;
        int count = 0;

        while (cur<=n) {
            count += Math.min(n+1, next)-cur;
            cur*= 10;
            next*= 10;
        }
        return count;
    }
}