import java.util.Scanner;

public class Rhombus {
    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the diagonal 1:");
        double d1= s.nextDouble();
        System.out.println("Enter the diagonal 2:");
        double d2= s.nextDouble();

        double  area=(d1*d2)/2;
        System.out.println("Area of Rhombus is: " + area);
    }
}

