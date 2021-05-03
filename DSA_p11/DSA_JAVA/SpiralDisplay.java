import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       
        Scanner scn = new Scanner(System.in);
        
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int mat[][] = new int[nr][nc];
        for(int i = 0 ; i < nr ; i++){
            for(int j = 0 ; j < nc ; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        
        spiralDisplay(mat);
    }

  public static void spiralDisplay(int mat[][])
  {
     
     int cmin=0,rmin=0,cmax=mat[0].length-1,rmax=mat.length-1;
     int count=0;
     int ttl=mat.length*mat[0].length;
     while(count<ttl)
     {
     
          for(int i=rmin,j=cmin;i<=rmax&&count<ttl;i++)
          {
              System.out.println(mat[i][j]);
              count++;
          }
          
          for(int i=cmin+1,j=rmax;i<=cmax&&count<ttl;i++)
          {
              System.out.println(mat[j][i]);
              count++;
          }
          
          for(int i=rmax-1,j=cmax;i>=rmin&&count<ttl;i--)
          {
              System.out.println(mat[i][j]);
              count++;
              
          }
          
          for(int i=cmax-1,j=rmin;i>=cmin+1&&count<ttl;i--)
          {
              System.out.println(mat[j][i]);
              count++;
          }
          rmin++;
          rmax--;
          cmin++;
          cmax--;
     }  
  }

}
