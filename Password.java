import java.util.Scanner;
 public class Password 
 {
      static String passwordStrength(String pass)
      {
        boolean haslength=false;
        boolean hasUpper=false;
        boolean hasDigit=false;
        boolean hasSpecchar=false;
       
        if (pass.length() >= 8) 
        {
            haslength = true;
            for (char c: pass.toCharArray())
            {
                if(Character.isDigit(c)){
                    hasDigit=true;
                }
                else if (Character.isUpperCase(c)){
                    hasUpper=true;
                }
                  else {
                    hasSpecchar=true;
                }

            }
        } 
        else {
            haslength = false;
        }
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

       String status = passwordStrength(password);
       System.out.println(status);

    }
     
    
}  
