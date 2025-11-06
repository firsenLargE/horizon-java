package recursiveMethods;

import java.util.Scanner;

public class DoublePalindrome {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String let = s.next();
        System.out.println(isPalindromeRec(let));
    }

    public static boolean isPalindromeRec(String s) {
        // Base case
        if (s.length() <= 1) {
            return true; // 1-letter or empty string is always palindrome
        }

        // If first and last characters don't match → not a palindrome
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        // Recursive step: compare remaining substring
        return isPalindromeRec(s.substring(1, s.length() - 1));
    }
}
