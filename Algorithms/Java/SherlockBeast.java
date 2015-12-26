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
            int n = in.nextInt();
            System.out.println(findDecentNumber(n));
        }
    }
    
    public static String findDecentNumber(int n){
        if(n<3 || n==4 || n==7){
            return "-1";
}else if(n==5){
            return "33333";
}
        int fives = n/3;
        int threes = 0;
        switch(n%3){
            case 0:
            break;
            case 1:
            fives -=3;
            threes +=2;
            break;
            case 2:
            fives--;
            threes++;
            break;
}
        return findDecentNumber(fives*3,threes*5);
}
    public static String findDecentNumber(int fives, int threes){
        char[] decent = new char[fives+threes];
        Arrays.fill(decent,0,fives,'5');
        Arrays.fill(decent,fives,decent.length,'3');
        return new String(decent);
}
}
