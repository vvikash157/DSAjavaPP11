import java.util.Scanner;

public class Solution{
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();  
        

        System.out.println("Golden Number : "+goldenNumber(n));
    }


    public static int sum=0;
    private static int goldenNumber(int n){
       
        if(n==1)
       {
           return 0;
       }
        if(n==2)
        {   sum++;
            return sum;
        }
        goldenNumber(n-1);
         goldenNumber(n-2);
         
        return sum;
    
        
    }

}
