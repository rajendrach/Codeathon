import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        if(time.charAt(8) == 'A'){
            String hString = time.substring(0,2);
            int hours = Integer.parseInt(hString);
            if(hours == 12){
                String hS = "00";
            String replace = time.replace(hString, hS);
                    System.out.println(replace.substring(0,8));
}else{
            System.out.println(time.substring(0,8));
            }
}else if(time.charAt(8) == 'P'){
            String hString = time.substring(0,2);
            int hours = Integer.parseInt(hString);
            hours = hours+12;
            if(hours==24){
                hours = 12;
            }
            String hS = Integer.toString(hours);
            String replace = time.replace(hString, hS);
                    System.out.println(replace.substring(0,8));

        }
    }
}
