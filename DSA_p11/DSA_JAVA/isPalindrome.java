import java.io.*;
import java.util.*;

public class Main {
    public static boolean ispalindrome(String ss)
    {   int lo=0;
        int hi=(ss.length())-1;
        while(lo<hi)
        {
            if(ss.charAt(lo)!=ss.charAt(hi))
            return false;
            lo++;
            hi--;
        }
        
        return true;
        
    }

	public static void solution(String str)
	{
	    int x=str.length();
	    for(int i=0;i<x;i++)
	    {   
	        for(int j=i+1;j<=x;j++){
	         String ss=(str.substring(i,j));
	         if(ispalindrome(ss))
	         System.out.println(ss);
	        
	        }
	    }
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}