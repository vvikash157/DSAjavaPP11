import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] ar=new int[n];
    for(int i=0;i<n;i++)
      ar[i]=sc.nextInt();
      
    int max=0;
     max=maxx(n,ar);
    bargraph(n,max,ar);
    //System.out.println(max);
 }
 public static void bargraph(int n,int max,int ar[])
{   
    for(int i=max;i>0;i--){
        for(int j=0;j<n;j++){
            if(ar[j]>=max)
             System.out.print("*\t");
             else
             System.out.print(" \t");
        }
        max--;
        System.out.print("\n"); 
    }
   
    
   
}
public static int maxx(int n,int ar[])
{   int mx=ar[0];
    for(int i=0;i<n;i++)
    mx=Math.max(mx,ar[i]);
    
    return mx;
}
}