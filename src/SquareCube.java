import java.util.Scanner;
public class SquareCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        double x = sc.nextDouble();
        double square = Math.pow(x,2);
        System.out.println("the square is:" +square);
        double cube = Math.pow(x,3);
        System.out.println("the cube is:" +cube);

    }
}
