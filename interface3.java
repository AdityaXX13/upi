interface A{
    public static final int x = 10; 
     void show();

    default void present() {
        System.out.println("This is a default method in the interface. in A");
    }
}
interface B {
    default void present() {
        System.out.println("This is a default method in the interface. in B");
    }


    default void activity() {
        System.out.println("This is a default method in the interface. in B Activity");
    }
}
class C implements A,B {
        public void present() {
            B.super.present(); // Call the present() method from interface B
            A.super.present(); // Call the present() method from interface A
                    System.out.println("This is the present method in class c.");
    }

        @Override
        public void show() {
            System.out.println("This is the show method in class c.");
             }
}

public class interface3 {
    public static void main(String[] args) {
        C c = new C();
        c.show();
        c.present();
        c.activity();
    }

}

