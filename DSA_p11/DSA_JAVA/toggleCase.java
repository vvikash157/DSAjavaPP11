import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
	 String vk="";
		for(int i=0;i<str.length();i++)
		{   
		    if(str.charAt(i)>='a'&&str.charAt(i)<='z')
		    {
		        vk+=(char)('A'+(str.charAt(i)-'a'));
		    }
		    else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
		    {
		        vk+=(char)('a'+(str.charAt(i)-'A'));
		    }
		    
		}

		return vk;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
    

