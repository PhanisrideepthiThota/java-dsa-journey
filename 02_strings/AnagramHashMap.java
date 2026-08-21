import java.util.HashMap;
import java.util.Scanner;

public class AnagramHashMap {

    public static boolean areAnagrams(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : str1.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < str2.length(); i++) {

            char c = str2.charAt(i);

            if (!hm.containsKey(c)) {
                return false;
            }

            hm.put(c, hm.get(c) - 1);

            if (hm.get(c) == 0) {
                hm.remove(c);
            }
        }

        return hm.isEmpty();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        boolean result = areAnagrams(str1, str2);

        System.out.println("Output: " + result);

        scanner.close();
    }
}
