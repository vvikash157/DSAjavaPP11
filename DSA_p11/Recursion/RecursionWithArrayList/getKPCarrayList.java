import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<String>list= getKPC(str); 
        System.out.println(list);
    }
    public static String keypad[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
      if(str.length()==0)
      {
          ArrayList<String>list1=new ArrayList<>();
          list1.add("");
          return list1;
      }
       //System.out.println(n1);
      String roq=str.substring(1);
      //System.out.println(roq);
      ArrayList<String>l1=getKPC(roq);
      String word=keypad[Integer.parseInt(str.charAt(0)+"")];
      ArrayList<String>myAns=new ArrayList<>();
      for(int i=0;i<word.length();i++)
      {
          for(String s:l1)
          {
              myAns.add(word.charAt(i)+s);
          }
      }
      return myAns;
    
    }

}
