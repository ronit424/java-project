package other;

public class StaticExample{
    static int ronit = 3;

    public static String deny(){
        return " Ronit";
    }

    public static void main(String[] args) {
        System.out.println(StaticExample.ronit);
        System.out.println(StaticExample.deny());
    }
}
