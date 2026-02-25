package palindromechecker;

import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("   Palindrome Checker App - UC4");
        System.out.println("===================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase (optional - case insensitive check)
        input = input.toLowerCase();

        // Convert String to char array
        char[] characters = input.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}
