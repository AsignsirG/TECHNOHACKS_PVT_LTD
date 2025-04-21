import java.util.Scanner;

public class FibonacciSequence {

    // Method to print Fibonacci sequence up to a given limit
    public static void generateFibonacci(int limit) {
        int a = 0, b = 1;

        System.out.print("Fibonacci sequence up to " + limit + ": ");
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(); // Move to new line after sequence
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fibonacci Sequence Generator");
        System.out.print("Enter the upper limit: ");
        int limit = scanner.nextInt();

        // Generate and display the sequence
        generateFibonacci(limit);

        scanner.close();
    }
}
