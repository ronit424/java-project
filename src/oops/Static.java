package oops;

public class Static {
    public static void main(String[] args) {
    StaticClass staticClass = new StaticClass();
    StaticClass.age= 10;
    StaticClass.dosomething("hi everyone");
    StaticClass.dosomethingelse("hello everyone");

    StaticClass staticClass1 = new StaticClass();
    staticClass1.age = 50;
        System.out.println(staticClass1.age);

    }
}
