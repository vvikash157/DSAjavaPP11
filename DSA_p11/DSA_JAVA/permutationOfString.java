import java.io.*;
import java.util.*;

public class Main {
    
    public static int fact(int n)
    {
       int factorial=1;
        for(int i=1;i<=n;i++)
        factorial=factorial*i;
        return factorial;
    }

	public static void solution(String str){
		int n=str.length();
		int fct=fact(n);
		for(int i=0;i<fct;i++)
		{
		    String res="";
	        String mstr=str;
		    int vikash=n;
		    int temp=i;
		    while(vikash!=0)
		    {
    		    int rem=temp % vikash;
    		  //  System.out.println(rem);
    		    temp=temp/vikash;
    		    res=res+mstr.charAt(rem);
    		    String lp=mstr.substring(0,rem);
    		    String rp=mstr.substring(rem+1);
    		    mstr=lp+rp;
    		    vikash--;
		    }
		    
		    	System.out.println(res);
		}
	
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}public class permutationOfString {
    
}
