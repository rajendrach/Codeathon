import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        int max = 0;
        int nom = 0;
        for(int i=0; i<n;i++){
            char[] cr = topic[i].toCharArray();
            for(int j=i+1;j<n;j++){
                int count = 0;
                char[] cr2 = topic[j].toCharArray();
                for(int k=0;k<m;k++){
                     char a   = cr[k];
                    char b = cr2[k];
                    if(a=='1'||b=='1'){
                        count++;
                    }
                }
                if(count>max){
                    max = count;
                    nom = 0;
                }
               if(count==max && count!=0){
                   nom++;
               }
            }
        }
        
        System.out.println(max);
        System.out.println(nom);
    }
}
