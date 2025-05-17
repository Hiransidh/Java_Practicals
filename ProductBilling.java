import java.util.Scanner;

public class ProductBilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int count = scanner.nextInt();

        int i = 1;
        double totalBill = 0;

        while (i <= count) {
            System.out.println("\nProduct " + i + ":");

            System.out.print("Enter price: ");
            double price = scanner.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            double bill = price * quantity;
            System.out.println("Bill for Product " + i + ": " + bill);

            totalBill += bill;
            i++;
        }

        System.out.println("\nTotal bill for all products: " + totalBill);
        scanner.close();
    }
}