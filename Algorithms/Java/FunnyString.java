import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            String s = "abcdefghijklmnopqrstuvwxyz"; 
            for(int i=0;i<t;i++){
                String st =  in.next();
                char[] cr = st.toCharArray();
                int n = cr.length-1;
                for(int j=1;j<=n;j++){
                    int a = s.indexOf(cr[j])- s.indexOf(cr[j-1]);
                    int b = s.indexOf(cr[n-j])- s.indexOf(cr[n-(j-1)]);
                    if(a<0) a= -(a);
                    if(b<0) b= -(b);
                    if(a!=b){
                        System.out.println("Not Funny");
                        break;
                    }
                    if(j==n){
                        System.out.println("Funny");
                    }
                }
                
            }
    }
}
