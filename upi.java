import java.util.Scanner;
interface Upi{
    default void payment(){
        System.out.println("payment is done using upi");
    }
}
interface Credit{
     default void payment(){
        System.out.println("payment is done using  credit");
     }
}
interface DebitCart{
    default void payment(){
    System.out.println("payment is done using debit card");
}
}
class Payment implements Upi,Credit,DebitCart{
     public void payment(){
        Upi.super.payment();
        Credit.super.payment();
        DebitCart.super.payment();
}

}
public class upi {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Upi p = new Payment();
            p.payment();
    }
    
}
    
