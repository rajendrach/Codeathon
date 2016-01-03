import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in  = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int count =0;
            String s = in.next();
            int length = s.length();
            int mid = length/2;
            char[] c1 = new char[mid];
            char[] c2 = new char[mid];
            Map<Character, Integer> mapOne = new HashMap<Character, Integer>();
            Map<Character, Integer> mapTwo = new HashMap<Character, Integer>();
            if(length%2!=0){
                count = -1;
            }else{
            for(int j=0;j<mid;j++){
                if(mapOne.containsKey(s.charAt(j))){
                    int num = mapOne.get(s.charAt(j));
                    num = num+1;
                    mapOne.put(s.charAt(j), num);
                }else{
                       mapOne.put(s.charAt(j),1);
                }
                //c1[j] = s.charAt(j);
            }
            for(int p=0;p<mid;p++){
                if(mapOne.containsKey(s.charAt(p+mid))){
                    int num = mapOne.get(s.charAt(p+mid));
                    num = num-1;
                    if(num ==0){
                        mapOne.remove(s.charAt(p+mid));
                    }else{
                    mapOne.put(s.charAt(p+mid), num);
                }
                }
               }
            for(Character key : mapOne.keySet()){
                int num = mapOne.get(key);
                count = count+num;
            }
           }
            System.out.println(count);
        }
    }
}
