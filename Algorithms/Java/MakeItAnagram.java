import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        char[] cr1 = s1.toCharArray();
        char[] cr2 = s2.toCharArray();
        int removals = 0;
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        int length1 = s1.length();
        int length2 = s2.length();
        for(int i=0; i<length1;i++){
            if(map1.containsKey(cr1[i])){
                int count = map1.get(cr1[i]);
                count = count+1;
                map1.put(cr1[i],count);
            }else{
                map1.put(cr1[i],1);
            }
        }
        for(int i=0; i<length2;i++){
            if(map1.containsKey(cr2[i])){
                int count = map1.get(cr2[i]);
                count = count -1;
                if(count ==0){
                    map1.remove(cr2[i]);
                }else{
                    map1.put(cr2[i],count);
                }
            }else{
                removals = removals + 1;
            }
        }
        for(Character key : map1.keySet()){
            int count = map1.get(key);
            removals = removals + count;
        }
        
        System.out.println(removals);
        
    }
}
