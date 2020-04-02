package arthmatics;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        if (a % 2 == 0)
            System.out.println("it is an even number");

        else
            System.out.println("it is not an even number");
    }
}
