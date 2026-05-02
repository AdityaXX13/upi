public class butterflypattern {
    public static void main(String[] args) {
        int n=4;
        int i, j;
      
        for (i = 1; i <= n; i++) {
                for (j = 1; j <= i; j++){
                System.out.print("*");
            
            }
            for (int k = 1; k <= 2*(n-i); k++) {
                System.out.print(" ");
            }
            for (j = 1; j <=i; j++){
                System.out.print("*");
            
            }
           System.out.println();
        
        }
  
        for (i = n-1; i >= 1; i--) {
                for (j = 1; j <= i; j++){
                System.out.print("*");
            
            }
            for (int k = 1; k <= 2*(n-i); k++) {
                System.out.print(" ");
            }
            for (j = 1; j <=i; j++){
                System.out.print("*");
            
            }
           System.out.println();
        
        }
    }
}
