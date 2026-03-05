package palindromechecker;

import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Algorithm 1: Reverse String Method
    public static boolean reverseMethod(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    // Algorithm 2: Stack Method
    public static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return str.equalsIgnoreCase(reversed);
    }

    // Algorithm 3: Two Pointer Method
    public static boolean twoPointerMethod(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Reverse Method Timing
        long start1 = System.nanoTime();
        boolean r1 = reverseMethod(input);
        long end1 = System.nanoTime();

        // Stack Method Timing
        long start2 = System.nanoTime();
        boolean r2 = stackMethod(input);
        long end2 = System.nanoTime();

        // Two Pointer Method Timing
        long start3 = System.nanoTime();
        boolean r3 = twoPointerMethod(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Reverse Method: " + r1 + " | Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Method: " + r2 + " | Time: " + (end2 - start2) + " ns");
        System.out.println("Two Pointer Method: " + r3 + " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}