import java.util.Scanner;
public class Countof5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start and end range: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i % 5 == 0) {
                count++;
            }
        }

        System.out.println("Count of multiples of 5 between is: " + count);
        scanner.close();
    }
}
