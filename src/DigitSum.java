import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();

        if (number >= 100 && number <= 999) {
            int firstDigit = number / 100;
            int thirdDigit = number % 10;
            int sum = firstDigit + thirdDigit;

            System.out.println("Sum of 1st and 3rd digit is: " + sum);
        } else {
            System.out.println("Invalid input. Please enter a 3-digit number.");
        }
    }
}
