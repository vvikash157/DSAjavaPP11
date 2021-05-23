import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        recursiveCode(n);
    }
    public static void recursiveCode(int n){
        
        if(n==1)
        {
            System.out.print(1+" ");
            return ;
        }
        recursiveCode(n-1);
        System.out.print(n+" ");
        recursiveCode(n-1);
        
    }
}