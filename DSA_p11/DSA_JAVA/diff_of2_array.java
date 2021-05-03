import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
  Scanner scn = new Scanner(System.in);
      int n1 = scn.nextInt();
      int [] ar=new int[n1];
      for(int i=0;i<n1;i++)
      ar[i]=scn.nextInt();
      int n2 = scn.nextInt();
      int [] arr=new int[n2];
      for(int i=0;i<n2;i++)
      arr[i]=scn.nextInt();
        
     diff(ar,n1,arr,n2);
 }
 public static void diff(int ar[],int n1,int arr[],int n2)
 {
    int n3=n1>n2?n1:n2;
    int carry=0;
    boolean flag=false;
    int [] arrr=new int[n3];
    int p1=n1-1,p2=n2-1,p3=n3-1;
    while(p3>=0)
    {
        int v1=p1>=0?ar[p1]:0;
        int v2=p2>=0?arr[p2]:0;
        v2=v2+carry;
        if(v2<v1)
        {
           int pp=(int)Math.pow(10,1);
            v2=v2+pp;
           carry=-1;
           
        }
         int sum=v2-v1;
         arrr[p3]=sum%10;
         p1--;
         p2--;
         p3--;
    }
    
    for(int i=0;i<n3;i++){
    if(arrr[i]!=0)
    {
        flag=true;
        
    }
    if(flag)
    {
     System.out.println(arrr[i]);
        
    }
  }
 }
}