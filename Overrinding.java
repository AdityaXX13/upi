class A{
    void add(int a, int b){
        System.out.println("Total from A class= " +(a+b));
    
    }
}
    class B extends A{
        void add(int a, int b){
            System.out.println("Total from B class= " +(a+b));
            }
    }   

public class Overrinding {
    public static void main(String[] args) {
        B b= new B();
        b.add(5, 10);
        
    }
    
}
