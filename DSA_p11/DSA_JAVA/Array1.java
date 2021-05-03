import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] ar=new int[n];
    for(int i=0;i<n;i++)
    {
        ar[i]=sc.nextInt();
    }
    int d=sc.nextInt();
    int flag=0;
    for(int j=0;j<n;j++)
    {
         if(ar[j]==d){
         System.out.println(j);
             flag=1;
             break;
         }
        //  else
        //  System.out.println("-1");
    }
    if(flag==0)
    System.out.println(-1);
    
 }

}
