import java.io.*;
import java.util.*;

public class getSubseqArrayList {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<String>list= gss(str);
        System.out.println(list);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0)
        {
             ArrayList<String> blist=new ArrayList<>();
             blist.add("");
             return blist;
        }
        char ch=str.charAt(0);
        String roq=str.substring(1);
        ArrayList<String> subseq=gss(roq);
        ArrayList<String> vks=new ArrayList<>();
        for(String s:subseq)
        {
            vks.add(s);
        }
        for(String s:subseq)
        {
            vks.add(ch+s);
        }
        
        return vks;
    }

}