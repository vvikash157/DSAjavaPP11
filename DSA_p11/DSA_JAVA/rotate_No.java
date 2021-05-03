  import java.util.*;
   public class Main{
   
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int k=sc.nextInt()
        int t=k%n;
        int c=t;
        int d=t;
        int rev=0,pos=0;
        int ctr=countOfDigits(n);
        while(n!=0)
        {
            int lastD=n%10;
            pos++;
            if(c!=0){
            rev+=lastD*Math.pow(10,(ctr-c+pos));
                c--;
            }
            if(c==0)
            {rev+=lastD*Math.pow(10,(pos-d));
                
            }
            n=n/10;
            
        }
        System.out.println(rev);
        
 }
 public static int countOfDigits(int n)
 {      int count=0;
     while(n!=0)
     {
         n=n/10;
         count++;
     }
     return count;
 }
}
  