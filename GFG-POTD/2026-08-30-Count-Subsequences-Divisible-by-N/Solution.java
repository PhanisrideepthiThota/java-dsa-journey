class Solution {
    public int countSubsequences(String s, int n) {

        long mod = 1000000007;
        long[] dp = new long[n];

        for (int i = 0; i < s.length(); i++) {

            int digit = s.charAt(i) - '0';

            long[] newDp = new long[n];

            // Start a new subsequence
            int rem = digit % n;
            newDp[rem]++;

            // Add digit to existing subsequences
            for (int r = 0; r < n; r++) {

                int newRem = (r * 10 + digit) % n;

                newDp[newRem] =
                    (newDp[newRem] + dp[r]) % mod;
            }

            // Don't take the current digit
            for (int r = 0; r < n; r++) {

                newDp[r] =
                    (newDp[r] + dp[r]) % mod;
            }

            dp = newDp;
        }

        return (int) dp[0];
    }
}
