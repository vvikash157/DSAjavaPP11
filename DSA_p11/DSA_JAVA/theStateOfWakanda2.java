import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();
        int mat[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        
         for(int i = 0 ; i < n ; i++){
            for(int j = 0 ,c=i; c < n ; j++,c++){
               System.out.println(mat[j][c]);
               
            }
         }
       
        
    }

}
