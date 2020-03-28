public class Boolean {
    public static void main(String[] args) {
        int x = 5;
        /*if(x <= 20){
            System.out.println("yes x == 10");
        }
        else {
            System.out.println("no x != 10");
        }*/
//x = 5 now
        if (x < 20) {
            if (x < 10) {
                System.out.println("you are small");
            } else if (x < 15) {
                System.out.println("you are big");
            } else {
                System.out.println("I can't say what you are");
            }
        } else {
            System.out.println("you are the greatest");
        }
        if (true) {
            if (x > 10) {
                if (x > 8) {
                    if (x > 6) {
                        System.out.println(" you reach here , I am " + x);
                    }
                }
            }
        }
    }
}
