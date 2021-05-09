import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       int mdn1=0,mdn2=0,fnmd=0,pos=0,rem=0,res=0;
       
       while(n2>0)
       {
           mdn2=(n2%10);
           mdn2+=rem;
           rem=0;
           mdn1=n1%10;
           if(mdn2<mdn1){
            mdn2+=Math.pow(b,1);
            rem=-1;}
           fnmd=(mdn2-mdn1)%b;
           pos++;
           res+=fnmd*Math.pow(10,pos-1);
           n2=n2/10;
           n1=n1/10;
       }
       return res;
   }
  
  }