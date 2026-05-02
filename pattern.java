public class pattern {
    public static void main(String[] args) {
        int n=4;
        int i, j;
        // i represents the number of rows and j represents the number of items to be placed on the ith group
        for (i = 1; i <= n; i++) {
                for (int k = 1; k <= n-i; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <=i; j++){
                System.out.print("* ");
            
            }
           System.out.println();
        
        }
  
    }      
}