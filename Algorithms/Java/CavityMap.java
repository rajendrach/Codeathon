import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[][] arr = new char[n][n];
        for(int grid_i=0; grid_i < n; grid_i++){
            String cmdString = in.next();
            for(int i=0;i<n;i++){
                    arr[grid_i][i] = cmdString.charAt(i);
            }
        }
        for(int i=1;i<n-1;i++){
            for(int j=1;j<n-1;j++){
                int current = (int) arr[i][j];
                int top = (int) arr[i-1][j];
                int bottom = (int)arr[i+1][j];
                int left = (int)arr[i][j-1];
                int right = (int)arr[i][j+1];
                if(current>top && current>bottom && current>left && current>right){
                    arr[i][j] = 'X';
                }
            }
        }
        
        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(arr[i][j]);
            }
            System.out.println(sb);
        }
    }
}
