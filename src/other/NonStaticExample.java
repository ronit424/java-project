package other;

public class NonStaticExample {
    int ram = 4;

    public String reny() {
        return "tom";
    }

    public static void main(String[] args) {
       NonStaticExample nonStaticExample = new NonStaticExample();
        System.out.println(nonStaticExample.ram);
    }
}
