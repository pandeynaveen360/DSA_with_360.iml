import java.util.Scanner;
public class Area_Circumference_of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of circle");
        double r = sc.nextDouble();

        double area = Math.PI*Math.pow(r,2);
        System.out.println("area of circle is:" +area);

        double circumference = 2*Math.PI*r;
        System.out.println("circumference is:" +circumference);

    }
}
