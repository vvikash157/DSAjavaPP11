import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str)
	{   
	    int n=str.length();
	    String st=str.charAt(0)+"";
	    for(int i=1;i<n;i++)
	    {   char curr=str.charAt(i);
	         char prev=str.charAt(i-1);
	        if(curr==prev)
	        { 
	        }
	        else
	            st=st+curr;
	    }

		return st;
	}

	public static String compression2(String str)
	{int n=str.length();
	int count=1;
	    String St=str.charAt(0)+"";
	    for(int i=1;i<n;i++)
	    {   char curr=str.charAt(i);
	        char prev=str.charAt(i-1);
    	        if(curr==prev)
    	        {
    	            count++;
    	        }
	            else
	            {
    	            if(count>1)
    	            {
    	                St=St+count;
    	                count=1;
    	            }
	              St+=curr;
	            }
	       }
		   if(count>1)
		   St=St+count;
		return St ;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
