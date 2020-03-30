package arthmatics;

import java.util.Scanner;
public class Input2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter some number");
        int user_input_number = scan.nextInt();

        System.out.println("so the entered value is");
        System.out.print(user_input_number);

        Scanner scan1 = new Scanner (System.in);
        System.out.println("enter some decimal value");
        double user_input_double = scan1.nextDouble();

        System.out.println("so the entered value is");
        System.out.print(user_input_double);

    }
}
