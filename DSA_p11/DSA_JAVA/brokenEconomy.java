import java.io.*;
import java.util.*;

public class Main{
    public static void res(int []ar,int d)
    {
        int l=ar.length;
        int lo=0,hi=l-1;
        int ceil=0,floor=0;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(d>ar[mid])
            {
                lo=mid+1;
                floor=ar[mid];
                
            }
            else if(d<ar[mid])
            {   hi=mid-1;
                ceil=ar[mid];
            }
            else 
            {
                ceil=ar[mid];
                floor=ar[mid];
                break;
            }
        //   lo++;
        //   hi--; 
        }
        System.out.println(ceil);
        System.out.println(floor);
    }

public static void main(String[] args) throws Exception 
{
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int [] ar=new int[n];
   for(int i=0;i<n;i++)
    ar[i]=sc.nextInt();
    int d=sc.nextInt();
    res(ar,d);
 }

}
