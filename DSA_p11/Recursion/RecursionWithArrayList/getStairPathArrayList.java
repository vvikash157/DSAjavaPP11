import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String>list= getStairPaths(n);
        System.out.println(list);
        
    }

    public static ArrayList<String> getStairPaths(int n) {
        
        if(n==0)
        {
            ArrayList<String> a=new ArrayList<>();
            a.add("");
            return a;
        }
        if(n<0)
        {
            ArrayList<String> b=new ArrayList<>();
           // b.add();
            return b;
        }

        
        ArrayList<String>myAns=new ArrayList<>();
        
        ArrayList<String>l1=getStairPaths(n-1);
        {
            for(String s:l1)
            myAns.add("1"+s);
        }
        
        ArrayList<String>l2=getStairPaths(n-2);
        {
             for(String s:l2)
            myAns.add("2"+s);
        }
        
        ArrayList<String>l3=getStairPaths(n-3);
        {
             for(String s:l3)
            myAns.add("3"+s);
        }
        
        
        return myAns;
    }

}
