import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;  // Get the last digit
            sum += digit;          // Add it to sum
            num = num / 10;        // Remove the last digit
        }

        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}