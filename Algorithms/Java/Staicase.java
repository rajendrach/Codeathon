import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = "#";
        for(int i=1;i<=n;i++){
            int nos = n-i;
            StringBuilder sp = new StringBuilder(nos);
            while(nos>0){
                sp.append(" ");
                nos--;
            }
            String rs = new String(new char[i]).replace("\0", s);
            System.out.println(sp+rs);
        }
    }
    
}
