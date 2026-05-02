public class MethodOverloading {
    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }               
    static double add(double a, double b) {
        return (int)(a + b);  // Cast the result to int before returning
    }
    public static void main(String[] args) {
        System.out.println(add(5, 10)); // Calls the int version
        System.out.println(add(5.1, 10.5)); // Calls the double version
        System.out.println(add(5, 10, 15)); // Calls the int version with three arguments
    }
    
}
