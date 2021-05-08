import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();
         int [] ar=new int[n];
         for(int i=0;i<n;i++)
          ar[i]=scn.nextInt();
         
         int bn=(int)Math.pow(2,n);
         for(int i=2;i<bn;i++)
         {  
             int bnum=binaryNo(i);
             printAr(bnum,ar);
              System.out.println();
             
         }
         
         
    }
     public static int binaryNo(int i)
     {  
         int vk=0,bnrm=0;
         while(i>0)
         {
             int rem=i%2;
             i=i/2;
             bnrm+=rem*Math.pow(10,vk);
             vk++;
             
         }
          return bnrm;
     }
     
     public static void printAr(int bnum,int ar[])
     {
         String str="";
         int n=ar.length;
         int v=n-1;
       
         
         while(n!=0)
         {
             int rem=bnum%10;
             bnum=bnum/10;
             if(rem==0)
             {
                 str="-\t"+str;
             }
             else if(rem==1)
             {
                 str=(ar[v]+"\t"+str);
             }
             n--;
             v--;
         }
        
             System.out.print(str);
         
     }

}