package oops;

public class Sum {
    public int sum(int a, int b) {
        return (a + b);
    }

    public int sum(int a, int b, int c) {
        return (a + b + c);
    }

    public double sum(double x, double y) {
        return (x + y);
    }

    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.sum(10, 6));
        System.out.println(s.sum(10, 20, 40));
        System.out.println(s.sum(20.6, 30.6));
    }
}
