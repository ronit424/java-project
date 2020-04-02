package condition;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d X %d = %d",i , j , (i * j));
                System.out.println();

            }
            System.out.println("--------");
        }
    }
}
