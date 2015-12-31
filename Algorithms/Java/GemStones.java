import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        int gemElements = 0;
        Map<Character, Integer> mainMap = new HashMap<Character,Integer>();
        for(int i=0;i<t;i++){
            String s = in.next();
            int length = s.length();
            char[] cr = s.toCharArray();
            Map<Character, Integer> innerMap = new HashMap<Character,Integer>();
            for(int j=0;j<length;j++){
                if(!innerMap.containsKey(cr[j])){
                    innerMap.put(cr[j],1);
                    if(mainMap.containsKey(cr[j])){
                         int count = mainMap.get(cr[j]);
                        count = count+1;
                        mainMap.put(cr[j],count);
                    }else{
                        mainMap.put(cr[j],1);
                    }
                }
                
            }
        }
        
        for(Character key: mainMap.keySet()){
            if(mainMap.get(key) == t){
                gemElements = gemElements +1;
            }
        }
        
        System.out.println(gemElements);
    
    }
}
