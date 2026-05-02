public class CallByValue {
    void add(int a, double b, String msg) {
        
        a=50;
        b=80.5;
        msg = "Hello";
        double sum = a + b;
        System.out.println("Sum: " + sum);
        
    }
    public static void main(String[] args) {
        int a =10;
        double b = 20.5;
        CallByValue sum = new CallByValue();
        String msg=new String("Hi......." );

        sum.add(a, b,msg);
        System.out.println("After calling add method:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("msg = " + msg);
       }
    }