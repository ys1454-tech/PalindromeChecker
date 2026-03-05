package palindromechecker;

import java.util.Scanner;
import java.util.Stack;

class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String str) {

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Create reversed string
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed
        return str.equalsIgnoreCase(reversed);
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        PalindromeChecker pc = new PalindromeChecker();

        if (pc.checkPalindrome(input)) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is not a Palindrome");
        }

        sc.close();
    }
}