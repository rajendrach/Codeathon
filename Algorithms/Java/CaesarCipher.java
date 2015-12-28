import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        while(k>26){
            k = k-26;
        }
        char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] workoutString = s.toCharArray();
        for(int i=0;i<workoutString.length;i++){
            
            String st = Character.toString(workoutString[i]);
            if(new String(alphabets).contains(st)){
                int index = new String(alphabets).indexOf(workoutString[i]);
                index = index + k;
                if(index>25){
                    index = index - 26;
                     workoutString[i] = alphabets[index];
                }else{
                        workoutString[i] = alphabets[index];
            }
            }else if(new String(ALPHABETS).contains(st)){
                int index = new String(ALPHABETS).indexOf(workoutString[i]);
                index = index + k ;
                if(index>25){
                    index = index - 26;
                     workoutString[i] = ALPHABETS[index];
                }else{
                        workoutString[i] = ALPHABETS[index];
                }
            
            }
        }
        System.out.println(new String(workoutString));
    }
}
