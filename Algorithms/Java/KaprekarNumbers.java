import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long p =  Long.valueOf(in.nextInt());
        long q = Long.valueOf(in.nextInt());
        int count =0;
        for(long i = p;i<=q;i++){
            if(kaprekar(i) ){
                System.out.print(i+" ");
                count++;
            }
        }
        if(count == 0){
            System.out.println("INVALID RANGE");
        }
    }
    
    public static boolean kaprekar(long i){
        long sq = i*i;
        String s = Long.toString(sq);
            
            if(sq<=9)
        s = "0"+s; 
     int l = s.length(); 
     int mid = l/2; 
 
     String left=s.substring(0,mid); 
     String right=s.substring(mid); 
 
     long x = Long.parseLong(left); 
     long y = Long.parseLong(right); 
 
     if(x+y == i) 
        return true;
     else
        return false;
   }
    
}
