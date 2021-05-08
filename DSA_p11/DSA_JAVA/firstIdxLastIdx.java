import java.io.*;
import java.util.*;

public class Main{
    
     public static void fstindx(int ar[],int d)
    { 
        int low=0,hig=ar.length-1,firstIdx=0;
        while(low<=hig)
        {
            int mid=(low+hig)/2;
            if(d>ar[mid])
            {   
                low=mid+1;
                
            }
            else if(d<ar[mid])
            {
                hig=mid-1;
            }else
            {
                 firstIdx=mid;
                low=mid+1;
            }
            
        }
        System.out.println(firstIdx);
    }        
    
    public static void lastindx(int ar[],int d)
    {
        int lo=0,hi=ar.length-1;
        int lasIdx=0;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(d>ar[mid])
            {   
                lo=mid+1;
                
            }
            else if(d<ar[mid])
            {
                hi=mid-1;
            }else
            {
                lasIdx=mid;
                hi=mid-1;
            }
        }
        System.out.println(lasIdx);
    }
    

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] ar=new int[n];
    for(int i=0;i<n;i++)
    {
        ar[i]=sc.nextInt();
    }
    int d=sc.nextInt();
    lastindx(ar,d);
    fstindx(ar,d);
    
    
    
 }

}