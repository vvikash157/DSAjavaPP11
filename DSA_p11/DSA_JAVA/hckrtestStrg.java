import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        String vks=str.replaceAll("\\s","");
        System.out.println(countWord(vks,0));
    }
public static int count=0;
    public static int countWord(String str,int idx){
       
        if(idx>str.length())
       {
           return count ;
       }
        String vk=str.substring(0,3);
        System.out.println(vk);
        String roq=str.substring(3);
        countWord(roq,idx+3);
        if(vk.equals("the"));
            count++;
        
        return count;
    }
}