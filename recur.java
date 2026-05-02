public class recur {
     static void recur(int a) {
        if (a>5)
        {
            return;
        }
        System.out.println(a);
            a++;
            recur(a);
        
        
    }
    public static void main(String[] args) {
        recur(2);
    }
}
