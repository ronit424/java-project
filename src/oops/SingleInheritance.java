package oops;

import class_op.Animal;

public class SingleInheritance {
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal {
    void bark(){System.out.println("barking...");}

    public void eat() {
    }
}
class TestInheritance{
    public static void main(String args[]){
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}
