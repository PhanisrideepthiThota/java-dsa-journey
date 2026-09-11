import java.util.*;

public class MaximumSubarrayElements {

    public static void maxSubArray(int[] arr) {

        int currentSum = arr[0];
        int maxSum = arr[0];

        int start = 0;
        int bestStart = 0;
        int bestEnd = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                start = i;
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                bestStart = start;
                bestEnd = i;
            }
        }

        System.out.println("Maximum Sum: " + maxSum);

        System.out.print("Subarray: ");

        for (int i = bestStart; i <= bestEnd; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        maxSubArray(arr);

        sc.close();
    }
}
