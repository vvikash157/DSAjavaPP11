import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();
        printSS(ss,"");
    }

    public static void printSS(String str, String ans) {
     
     if(str.length()==0)
     {
         System.out.println(ans);
         return;
     }
     
     char vks=str.charAt(0);
     String roq=str.substring(1);
     
       printSS(roq, ans+vks);
       printSS(roq, ans);
    }

}
