import java.util.*;

class Solution {
    public int minCost(int[][] mat) {

        int[] dp = new int[3];

        // First row
        dp[0] = mat[0][0];
        dp[1] = mat[0][1];
        dp[2] = mat[0][2];

        // Process remaining rows
        for (int i = 1; i < mat.length; i++) {

            int[] newDp = new int[3];

            newDp[0] = mat[i][0] + Math.min(dp[1], dp[2]);
            newDp[1] = mat[i][1] + Math.min(dp[0], dp[2]);
            newDp[2] = mat[i][2] + Math.min(dp[0], dp[1]);

            dp = newDp;
        }

        return Math.min(dp[0], Math.min(dp[1], dp[2]));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][3];

        System.out.println("Enter " + n + " rows with 3 costs:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        Solution obj = new Solution();

        int result = obj.minCost(mat);

        System.out.println("Minimum cost: " + result);

        sc.close();
    }
}
