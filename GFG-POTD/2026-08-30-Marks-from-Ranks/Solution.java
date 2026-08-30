import java.util.*;

class Solution {

    public static ArrayList<Integer> getMarks(int[] l, int[] r, int[] rank) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int x : rank) {

            int count = 0;

            for (int i = 0; i < l.length; i++) {

                int size = r[i] - l[i] + 1;

                if (x <= count + size) {

                    int mark = l[i] + (x - count - 1);
                    ans.add(mark);
                    break;
                }

                count += size;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] l = new int[n];
        int[] r = new int[n];

        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int[] rank = new int[k];

        for (int i = 0; i < k; i++) {
            rank[i] = sc.nextInt();
        }

        ArrayList<Integer> result = getMarks(l, r, rank);

        System.out.println(result);

        sc.close();
    }
}
