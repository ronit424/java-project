import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter some number");
        int user_input_number = scan.nextInt();

        System.out.println("so the entered value is");
        System.out.println(user_input_number);
    }
}
