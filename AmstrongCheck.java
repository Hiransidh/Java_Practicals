import java.util.Scanner;

public class AmstrongCheck {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        int original = num;

        int digits = 0;
        int temp = num;

        // Count number of digits
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        int sum = 0;
        temp = num;

        // Calculate sum of power of digits
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits); // digit ^ digits
            temp /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }

        scanner.close();
    }

}
