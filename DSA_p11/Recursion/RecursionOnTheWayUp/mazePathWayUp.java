import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {

            Scanner sc=new Scanner(System.in);
            int nr=sc.nextInt();
            int nc=sc.nextInt();
            
            printMazePaths(0, 0, nr-1, nc-1, "");
	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
	        
	        if(sr>dr||sc>dc)
	        return;
	        
	        if(sr==dr && sc==dc)
	        {
	            System.out.println(psf);
	        }
	       printMazePaths(sr+1, sc, dr, dc, "h"+psf);
	       printMazePaths(sr, sc+1, dr, dc, "v"+psf);
	    }

	}
