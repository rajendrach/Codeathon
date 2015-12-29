import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int t = in.nextInt();
        for(int i=0; i<t; i++){
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            for(int j=0;j<n;j++){
                if(a<=b){
                System.out.print(a*(n-1-j)+ b*j + " ");
                }else{
                    System.out.print(a*j+ b*(n-1-j) + " ");
                }
                if(a==b) break;
            }
            System.out.println();
        }
    }
}
