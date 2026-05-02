public class pramid {
    public static void main(String[] args) {
        int n=4;
        int i, j;
      
        for (i = 1; i <= n; i++) {
                for (int k = 1; k <= n-i; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <=2*i-1; j++){
                System.out.print("* ");
            
            }
           System.out.println();
        
        }
  
    }
}
