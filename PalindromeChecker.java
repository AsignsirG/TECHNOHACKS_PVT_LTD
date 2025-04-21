import java.util.Scanner;

public class PalindromeChecker {

    // Method to reverse a string
    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Convert to lowercase and remove spaces for more accurate check (optional)
        String processed = original.replaceAll("\\s+", "").toLowerCase();

        String reversed = reverseString(processed);

        // Check if the string is a palindrome
        if (processed.equals(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }

        scanner.close();
    }
}
