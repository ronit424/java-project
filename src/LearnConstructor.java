public class LearnConstructor {
    public LearnConstructor() {
        System.out.println("constructor was called");
    }

    public LearnConstructor(String name) {
        System.out.println("2nd constructor with name "+ name);
    }


    public static void main(String[] args) {
        LearnConstructor myObject = new LearnConstructor();
        LearnConstructor myObject2 = new LearnConstructor();
        LearnConstructor myObject3 = new LearnConstructor("ronit");
        //System.out.println(myObject.sayHello("ronit"));
    }


    public String sayHello(String name) {
        return "hello "+name;
    }
}
