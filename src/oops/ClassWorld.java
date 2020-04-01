package oops;

public class ClassWorld {
    public static void main(String[] args) {
        Bank abc = new BankABC();
        Bank def = new BankDEF();
        Bank xyz = new BankXYZ();

        System.out.println(abc.getInterestRate());
        System.out.println(def.getInterestRate());
        System.out.println(xyz.getInterestRate());
    }
}
