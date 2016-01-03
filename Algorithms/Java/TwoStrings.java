import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            String returnString = "NO";
              String s1 = in.next();
              String s2 = in.next();
            for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray())
             {
                if(s1.indexOf(c) > -1 && s2.indexOf(c) > -1)
                returnString = "YES";
            }
            System.out.println(returnString);
        }
    }
}
