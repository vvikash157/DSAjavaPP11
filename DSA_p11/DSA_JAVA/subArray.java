import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();
         int [] ar=new int[n];
         for(int i=0;i<n;i++)
          ar[i]=scn.nextInt();
         
        
         for(int i=0;i<n;i++)
         {
            for(int j=i;j<n;j++)
            {
                  for(int k=i;k<=j;k++)
                  {
                      System.out.print(ar[k]+"	");
                  }
             System.out.println();
            }
             
         }
    }
}
