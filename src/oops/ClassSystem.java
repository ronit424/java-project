package oops;

public class ClassSystem {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();

        rec.set(10,10);
        tri.set(10,10);

        System.out.println(rec.area());
        System.out.println(tri.area());

    }
}
