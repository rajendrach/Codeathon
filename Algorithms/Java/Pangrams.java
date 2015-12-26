import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String s  = in.nextLine();
        s.trim();
        s = s.toLowerCase();
        s = s.replaceAll("\\s+","");
        char[] stringArray = s.toCharArray();
        Arrays.sort(stringArray);
        int length = stringArray.length;
        int j =0;
        int count =0;
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();  
        String ds = "";
        if(length<26){
            System.out.println("not pangram");
        }else{
            for(int i=0;i<length;i++){
                if(alphabet[j]==stringArray[i]){
                    count++;
                    while(i+1<length && stringArray[i]==stringArray[i+1]){
                        i++;
                    }
                    j++;
}else{
       ds = "not pangram";
       break;
}
            }
            if(count == 26){
                ds = "pangram";
}
            System.out.println(ds);
        }
    }
}
