public class Switch {
    public static void main(String[] args) {
        int score = 40;
                switch (score)
                {
                    case 90 :
                        System.out.println("very good");
                        break;
                    case 60 :
                        System.out.println("good");
                        break;
                    case 40 :
                        System.out.println("ok");
                        break;
                    default:
                        System.out.println("the grades are not defined");
                        break;
                }
    }
}
