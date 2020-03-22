public class Calculator {
    public static void main(String args[]){
     Calculator calculator = new Calculator();
     int result = calculator.add(2,3);
     System.out.println(result);
    }
    private int add(int a, int b){
        return a+b;
    }
}
