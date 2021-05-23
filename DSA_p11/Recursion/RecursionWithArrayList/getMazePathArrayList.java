import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        int nr=sc.nextInt();
        int nc=sc.nextInt();
        String ch="";
        ArrayList<String>vks= getMazePaths(0,0,nr-1,nc-1);
        System.out.println(vks);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc)
    {  
        if(sr==dr&&sc==dc)
        {
         ArrayList<String> blist=new ArrayList<>();
         blist.add("");
         return blist;
         
        }
        
        
        ArrayList<String> myAns=new ArrayList<>();
       
       if(sr+1<=dr)
       {
           ArrayList<String>vPath=getMazePaths(sr+1,sc,dr,dc);
           for(String pth : vpath)
           {
               myAns.add("v"+pth);
           }
       }
       if(sc+1<=dc)
       {
         ArrayList<String>hPath=getMazePaths(sr,sc+1,dr,dc);  
         for(String hpth : hpath)
           {
               myAns.add("h"+hpth);
           }
       }
       
       
      
       
        return myAns;
    }

}
