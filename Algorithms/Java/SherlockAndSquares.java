import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n;i++){
            int p = in.nextInt();
            int q = in.nextInt();
            int C = (int)(Math.floor(Math.sqrt(q)) - Math.ceil(Math.sqrt(p)) + 1);
            System.out.println(C);
        }
    }
}
