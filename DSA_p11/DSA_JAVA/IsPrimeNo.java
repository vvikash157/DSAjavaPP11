import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t=scn.nextInt();
       
        for(int i=0;i<t;i++)
        {
            int num=scn.nextInt();
            int count=0;
                 if(num==2||num==3)
                 System.out.println("prime");
                     else{
                            for(int j=2;j*j<=num;j++)
                             {   if(num%j==0)
                                count++;
                    
                             }
                           
                             if(count==0)
                             {
                                     System.out.print("prime\n");
                                    
                             }
                        
                            else
                                System.out.print("not prime\n");
                         }
             
        }
       
       
  
    }
}