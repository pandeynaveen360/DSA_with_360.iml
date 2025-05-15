import java.util.Scanner;
public class Square_of_middle_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three digit number:");
        int number = sc.nextInt();

        if(number >= 100 && number<=999) {
            int middlenumber = (number/10)%10;
            int square = middlenumber*middlenumber;
            System.out.println("the suqare of middle digit is:" +square);
        }
        else{
            System.out.println("enter valid three digit number.");
        }
    }
}
