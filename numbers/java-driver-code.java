import java.io.*;
import java.util.*;
class Magic
{
   public static boolean isMagic(int n)
   {
       int sum = 0;
     
       while (n > 0 || sum > 9)
       {
           if (n == 0)
           {
               n = sum;
               sum = 0;
           }
           sum += n % 10;
           n /= 10;
       }
      
      
       return (sum == 1);
   }
   
  
   public static void main(String args[])
    {
     int n = 1234;
     if (isMagic(n))
        System.out.println("Magic Number");
          
     else
        System.out.println("Not a magic Number");
    }
}
 

public class Main {
  	// The main function reads the input in the required format.
  	// Just complete the solve function below.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int n =  Integer.parseInt(br.readLine());
            String out_ = solve(n);
            System.out.println(out_);
         }
         wr.close();
         br.close();
    }
  
    static String solve(int n){
      	// Your code goes here
        // n is the given input
      
        String result = "Special";
        return result;
    }
}
