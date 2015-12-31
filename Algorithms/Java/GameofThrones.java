import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
        int odd = 0;
       Map<Character, Integer> myMap = new HashMap<Character, Integer>();
        String ans;
        char[] cr = inputString.toCharArray();
        for(int i=0;i<inputString.length();i++){
                if(myMap.containsKey(cr[i])){
                    int count = myMap.get(cr[i]);
                    count = count+1;
                    myMap.put(cr[i],count);
                }else{
                    myMap.put(cr[i],1);
                }
        }
        for(Character key: myMap.keySet()){
            int val = myMap.get(key);
            if(val%2!=0){
                odd = odd+1;
            }
        }
        
        if(odd>1){
            ans="NO";
        }else{
            ans="YES";
        }
        
        System.out.println(ans);
        myScan.close();
    }
}
