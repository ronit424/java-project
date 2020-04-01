
package class_op;

public class ModifiersClass {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setId(20);
        student1.setName("Ronit");
        student1.setAge(15);

        System.out.println("First Student Details");
        System.out.println("------------------------");
        System.out.println("Roll no: " + student1.getId());
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("------------------------");

        Student student2 = new Student();
        student2.setId(26);
        student2.setName("Alex");
        student2.setAge(15);

        System.out.println("First Student Details");
        System.out.println("------------------------");
        System.out.println("Roll no: " + student2.getId());
        System.out.println("Name: " + student2.getName());
        System.out.println("Age: " + student2.getAge());
        System.out.println("------------------------");

    }
}
