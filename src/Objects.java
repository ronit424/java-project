public class Objects {
    public static void main(String[] args) {
        Student mark = new Student();
        mark.age = 1;
        mark.name = "mark";
        mark.id = 15;
        System.out.println(mark.name + "is" + mark.age + "years old");
        Student tom = new Student();
        tom.age = 2;
        tom.name = "tom";
        tom.id = 24;
        System.out.println(tom.name + "is" + tom.age + "years old");
    }
}
