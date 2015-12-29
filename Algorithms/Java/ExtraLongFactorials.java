import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger factorial = BigInteger.valueOf(1);
        while(n>1){
            factorial = factorial.multiply(BigInteger.valueOf(n));
            n = n-1;
        }
        System.out.println(factorial);
    }
    
}
