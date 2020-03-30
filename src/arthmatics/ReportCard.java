package arthmatics;

import java.util.Scanner;

/*
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
 */
public class ReportCard {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the marks  ");
        int a= sc.nextInt();
        if (a >= 90){
            System.out.println("A");
        }
        else if (a >= 80){
            System.out.println("B");
        }
        else if (a >= 70) {
            System.out.println("C");
        }
        else if (a >= 60) {
            System.out.println("D");
        }
        else if (a >= 40) {
            System.out.println("E");
        }
        else if (a < 40) {
            System.out.println("F");
        }
    }
}
