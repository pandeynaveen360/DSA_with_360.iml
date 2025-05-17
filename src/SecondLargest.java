import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        int secondLargest;

        if ((a > b && a < c) || (a > c && a < b)) {
            secondLargest = a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            secondLargest = b;
        } else {
            secondLargest = c;
        }

        System.out.println("The second largest number is: " + secondLargest);

        scanner.close();
    }
}
