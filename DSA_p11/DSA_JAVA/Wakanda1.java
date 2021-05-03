import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int nr=sc.nextInt();
    int nc=sc.nextInt();
    int mat[][]=new int[nr][nc];
    for(int i=0;i<nr;i++)
    {
        for(int j=0;j<nc;j++)
        {
            mat[i][j]=sc.nextInt();
        }
    }
    
    for(int k=0;k<nc;k++)
    {   
        if(k%2==0)
        {
            for(int l=0;l<nr;l++)
            {
                System.out.println(mat[l][k]);
            }
            
        }
        else if(k%2!=0)
        {   
                for(int u=nr-1;u>=0;u--)
                {
                    System.out.println(mat[u][k]);
                }
            
        }
        
    }
 }

}
