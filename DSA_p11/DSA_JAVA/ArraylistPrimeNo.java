import java.io.*;
import java.util.*;

public class Main {
    public static boolean isprime(int t)
    {
        for (int j=2;j*j<=t;j++)
        {
            if(t%j==0)
            return false;
        }
        return true;
    }

	public static void solution(ArrayList<Integer> al){
		int n=al.size();
		    
		    for(int i=n-1;i>=0;i--)
		    {   int t=al.get(i);
		        if(isprime(t))
		        {
		            al.remove(i);
		        }
		        
		        
		    }
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}