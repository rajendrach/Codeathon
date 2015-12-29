import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s = s.replaceAll("\\s+","");
        double L = (double)s.length();
        double sqrt = Math.sqrt(L);
        int rows = (int)Math.floor(sqrt);
        int cols = (int)Math.ceil(sqrt);
        char[] arr = s.toCharArray();
        int length = arr.length;
        if(rows* cols< length){
            rows = rows + 1;
        }
        
        int charcount = 0;
        char[][] chararr = new char[rows][cols];
        mainloop:
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                chararr[i][j] = arr[charcount];
                charcount = charcount +1;
            if(charcount>=length){
                break mainloop;
            }
            }
            
        }
        charcount = 0;
        secondloop:
        for(int p=0;p<cols;p++){
            StringBuilder sb = new StringBuilder();
            for(int q=0;q<rows;q++){
                if(chararr[q][p]!=0){
                sb.append(chararr[q][p]);
                 charcount = charcount +1;
            if(charcount>=length){
                break ;
            }
                }
            }
            System.out.print(sb+" ");
            if(charcount>=length) break;
            }
            
    }
}
