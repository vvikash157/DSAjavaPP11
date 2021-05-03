import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int k = scn.nextInt();
      int [] ar=new int[n];
      for(int i=0;i<n;i++)
      ar[i]=scn.nextInt();
      bSearch(ar,n,k);
 }
 public static void bSearch(int ar[],int n,int k)
    { int low=0,high=n-1;
        int ceil=-1;
        int floor=-1;
        
         while(low<=high)
        {int mid=(low+high)/2;
            if(ar[mid]==k)
            {
             ceil=floor=ar[mid];
             break;
            }
             else if(k<ar[mid])
             {
             high=ar[mid-1];
             ceil=ar[mid];
             break;
             }
             else if(k>ar[mid])
             {
                 low=ar[mid+1];
                 floor=ar[mid];
                 break;
             }
       
         }
    System.out.println(ceil+"\n"+floor);
    }  

}
