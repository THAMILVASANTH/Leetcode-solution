class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
            int largestPrime = 0;

            for (int i = 0; i < n; i++) {
                if (isPrime(nums[i][i])) {
                    largestPrime = Math.max(largestPrime, nums[i][i]);
                }


                if (isPrime(nums[i][n - i - 1])) {
                    largestPrime = Math.max(largestPrime, nums[i][n - i - 1]);
                }
            }

            return largestPrime;
    }
    public static boolean isPrime(int num) {
            if (num <= 1) return false;
            if (num <= 3) return true;
            if (num % 2 == 0 || num % 3 == 0) return false;

            for (int i = 5; i * i <= num; i += 6) {
                if (num % i == 0 || num % (i + 2) == 0) return false;
            }
            return true;
        }
}