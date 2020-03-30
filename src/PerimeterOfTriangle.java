import java.util.Scanner;

public class PerimeterOfTriangle {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first side:");
        System.out.println("Enter the second  side:");
        System.out.println("Enter the third side:");

        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        double perimeter = a + b + c;

        System.out.println("perimeter of Square is: " + perimeter);
    }
}
