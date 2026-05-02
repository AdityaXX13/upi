interface animals{
    void sound();

    default void eat() {
        System.out.println("Animal is eating");
    }
    default void sleep() {
        System.out.println("Animal is sleeping");
    }
}
 class bird implements animals{
    public void sound() {
        System.out.println("Birds chirpping...");
    }
    void fly(){
        System.out.println("Birds can fly");
    }
 } 
 class sparrow extends bird {
     public
    void sound() {
        System.out.println("Sparrow is chirpping...");
    }
    void fly(){
        System.out.println("Sparrow can fly");
    } 
}      

public class interface1 {
    public static void main(String[] args) {
        bird a = new sparrow();
        a.sound();
        a.eat();
        a.fly(); // This will cause a compile-time error because the fly() method is not defined in the animals interface
        a.sleep(); // This will also cause a compile-time error because the sleep() method is not defined in the animals interface
    }
}
