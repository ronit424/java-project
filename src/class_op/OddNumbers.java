package class_op;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();


        if ( num % 2 != 0 )
            System.out.println(" the Entered number is odd");

    }
}

