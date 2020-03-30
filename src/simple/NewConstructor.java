package simple;

public class NewConstructor {
    public NewConstructor() {
        System.out.println("constructor was called");
    }

    public NewConstructor(String name) {
        System.out.println("2nd constructor with name "+ name);
    }


    public static void main(String[] args) {
        NewConstructor myObject = new NewConstructor();
        NewConstructor myObject2 = new NewConstructor();
        NewConstructor myObject3 = new NewConstructor("ronit");
        //System.out.println(myObject.sayHello("ronit"));
    }


    public String sayHello(String name) {
        return "hello "+name;
    }
}
