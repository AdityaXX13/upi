abstract class Animals {
    int no_of_legs;
    String name;
  
    abstract void sound(); // Abstract method (does not have a body)
    void eat(){
        System.out.println("eating...");
    }
}

class Bird extends Animals {
    int no_of_legs = 2;
    String name = "Sparrow";

    void sound() {
        System.out.println("Birds chirpping...");
    }
    void fly(){
        System.out.println("Birds can fly");
    }
}
public class abstraction1 {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.sound();
        b.eat();
        b.fly();
    }
}
