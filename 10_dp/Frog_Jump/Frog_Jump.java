import java.util.Scanner;

public class FrogJump {

    public static int frogJump(int[] height) {

        int n = height.length;

        int[] dp = new int[n];

        dp[0] = 0;

        for (int i = 1; i < n; i++) {

            int left = dp[i - 1]
                    + Math.abs(height[i] - height[i - 1]);

            int right = Integer.MAX_VALUE;

            if (i > 1) {
                right = dp[i - 2]
                        + Math.abs(height[i] - height[i - 2]);
            }

            dp[i] = Math.min(left, right);
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter heights:");

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        System.out.println("Minimum Energy = " + frogJump(height));

        sc.close();
    }
}
