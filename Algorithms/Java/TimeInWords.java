import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        
        Map<Integer, String> timeInWords = createMap();
        String hour = timeInWords.get(h);
        String minutes = timeInWords.get(m);
        String extraHour = timeInWords.get(h+1);
        String extraMinute = "";
        if(m>30){
            extraMinute = timeInWords.get(60-m);
        }
        if(m==0){
            System.out.println(hour+" o' clock");
        }else if(m>0 && m<=30){
            
            if (m==15){
                System.out.println("quarter past "+hour);
            }else if(m==30){
                System.out.println("half past "+hour);
            }else{
                if(m==1){System.out.println(minutes+" minute past "+hour);}else{
                    System.out.println(minutes+" minutes past "+hour);}
            }
        }else{
            if(m==45){
                
                System.out.println("quarter to "+extraHour);
            }else{
                if(60-m == 1){
                    System.out.println(extraMinute+" minute to "+extraHour);
                }else{
                System.out.println(extraMinute+" minutes to "+extraHour);
                }
            }
        }
    }
    
    public static Map<Integer, String> createMap(){
        Map<Integer, String> numberMap = new HashMap<Integer, String>();
        numberMap.put(0,"Zero");
                numberMap.put(1,"one");
                numberMap.put(2,"two");
                numberMap.put(3,"three");
                numberMap.put(4,"four");
                numberMap.put(5,"five");
                numberMap.put(6,"six");
                numberMap.put(7,"seven");
                numberMap.put(8,"eight");
                numberMap.put(9,"nine");
                numberMap.put(10,"ten");
                numberMap.put(11,"eleven");
                numberMap.put(12,"twelve");
                numberMap.put(13,"thirteen");
                numberMap.put(14,"fourteen");
                numberMap.put(15,"fifteen");
                numberMap.put(16,"sixteen");
                numberMap.put(17,"seventeen");
                numberMap.put(18,"eighteen");
                numberMap.put(19,"nineteen");
                numberMap.put(20,"twenty");
        numberMap.put(21,"twenty one");
        numberMap.put(22,"twenty two");
        numberMap.put(23,"twenty three");
        numberMap.put(24,"twenty four");
        numberMap.put(25,"twenty five");
        numberMap.put(26,"twenty six");numberMap.put(27,"twenty seven");numberMap.put(28,"twenty eight");
        numberMap.put(29,"twenty nine");
                numberMap.put(30,"thirty");
        
        return numberMap;
                
    }
}
