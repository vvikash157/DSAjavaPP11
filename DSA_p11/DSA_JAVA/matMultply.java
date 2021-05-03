import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int nr=sc.nextInt();
        int nc=sc.nextInt();
        int a1[][]=new int[nr][nc];
        for(int i=0;i<nr;i++)
        {
            for(int j=0;j<nc;j++)
            {
                a1[i][j]=sc.nextInt();
            }
        }
        
        int nr2=sc.nextInt();
        int nc2=sc.nextInt();
        int a2[][]=new int[nr2][nc2];
        for(int i=0;i<nr2;i++)
        {
            for(int j=0;j<nc2;j++)
            {
                a2[i][j]=sc.nextInt();
            }
        }
        
        if(nc==nr2)
        {
          int res[][]=new int[nr][nc2];
           for(int i=0;i<nr;i++)
             {
                for(int j=0;j<nc2;j++)
                {
                   for(int k=0;k<nr2;k++)
                   {
                        res[i][j]=res[i][j]+(a1[i][k]*a2[k][j]);
                   }
                   
                }
             }
         
              for(int i=0;i<nr;i++)
            {
                for(int j=0;j<nc2;j++)
                {
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
        }
         else
         System.out.println("Invalid input");
        
      
   
    }
    

}
