import java.util.Scanner;
 public class Days_to_year_month_remainsday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of days:");
        int totaldays = sc.nextInt();

        int years = totaldays/360;
        int remainingdays = totaldays%360;
        int months = remainingdays / 30;
        int days = remainingdays % 30;

        System.out.println("years:" + years);
        System.out.println("months:" + months);
        System.out.println("days:" + days);

    }
}
