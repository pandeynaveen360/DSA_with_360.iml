import java.util.Scanner;
public class DigitPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter four digit number:");
        int number = sc.nextInt();

        if(number >= 1000 && number<=9999) {
            int firstdigit = (number/1000);
            int secdigit = (number/100)%10;
            int thirddigit = (number/10)%10;
            int fourthdigit = (number%10);

            System.out.println(firstdigit);
            System.out.println(secdigit);
            System.out.println(thirddigit);
            System.out.println(fourthdigit);
        }
        else {
            System.out.println("enter valid four digit number.");
        }
    }
}
