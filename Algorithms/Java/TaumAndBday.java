import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = Long.valueOf(in.nextInt());
            long w = Long.valueOf(in.nextInt());
            long x = Long.valueOf(in.nextInt());
            long y = Long.valueOf(in.nextInt());
            long z = Long.valueOf(in.nextInt());
            long cost = 0;
            if(x+z < y){
                cost = (b*x) + (w*(x+z));
            }else if(y+z<x){
                cost = (b*(y+z)) + (w*y);
            }else
            if(x<z && y<z){
                cost = b*x + y*w;
            }else if(x==y&& y==z){
                cost = b*x + y*w;
            }else{
                cost = b*x + y*w;
            }
            System.out.println(cost);
        }
    }
}
