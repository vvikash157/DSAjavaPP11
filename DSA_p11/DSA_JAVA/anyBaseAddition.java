import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int x, int y){
      int pos=0,rem=0,res=0;
       while(x!=0 || y!=0)
       { int xmd=x%10;
         int ymd=y%10;
         int fnmd=(xmd+ymd+rem)%b;
           pos++;
         rem=(xmd+ymd+rem)/b;
         res+=fnmd*Math.pow(10,pos-1);
         x=x/10;
         y=y/10;
         if(x==0 && y==0)
         {
             res+=rem*Math.pow(10,pos);
         }
       }
       return res;
    }    
  
}