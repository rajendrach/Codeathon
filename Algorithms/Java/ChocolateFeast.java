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
            int n = in.nextInt(); // Total amount
            int c = in.nextInt(); // cost of each choclate
            int m = in.nextInt(); // no.of wrappers needed
            int noc = 0;
            int wrappers = 0;
            if(n>c){
                noc = n/c;
                wrappers = noc;
                while(wrappers>= m){
                    int remainingWrappers =  wrappers%m;
                    noc = noc + (wrappers/m);
                    wrappers = remainingWrappers + (wrappers/m);
                }
            }
            System.out.println(noc);
        }
    }
}
