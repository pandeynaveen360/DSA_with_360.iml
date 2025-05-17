import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double amount = rate * quantity;
        double netAmount;

        if (amount > 2000) {
            double discount = amount * 0.15;
            netAmount = amount - discount;
            System.out.println("Discount applied: ₹" + discount);
        } else {
            netAmount = amount;
            System.out.println("No discount applied.");
        }

        System.out.println("Net amount to be paid: ₹" + netAmount);
    }
}

