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
        
        
        transpose(mat);
        reverseRowWise(mat);
        display(mat);

    }
        public static void transpose(int mat[][])
        {
            int n=mat.length;
           for(int i=0;i<n;i++)
           {
               for(int j=i+1;j<n;j++)
               {
                  int temp=mat[i][j]; 
                 mat[i][j]=mat[j][i];
                 mat[j][i]=temp;
               }
           }
        }
    
        public static void reverseRowWise(int mat[][]){
            int n=mat.length;
            for(int i=0;i<n;i++)
            {
                int low=0,high=n-1;
                while(low<high)
                {
                    int temp=mat[i][low];
                    mat[i][low]=mat[i][high];
                    mat[i][high]=temp;
                    low++;
                    high--;
                }
            }
        }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
