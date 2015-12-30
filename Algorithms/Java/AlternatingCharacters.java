import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
           Scanner in  =  new Scanner(System.in);
        int t = in.nextInt();
        for(int i =0; i<t;i++){
            String s = in.next();
            int length = s.length();
            char[] cr = s.toCharArray();
            int count=0;
            for(int j = 0; j<length-1;j++){
                if(cr[j]==cr[j+1]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
