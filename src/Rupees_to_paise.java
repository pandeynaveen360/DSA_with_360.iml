import java.util.Scanner;
public class Rupees_to_paise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rupees:");
        double rupees = sc.nextDouble();

         int paise = (int)(rupees * 100);
        System.out.println("equivalent amount in paise is:"+ paise);

    }
}
