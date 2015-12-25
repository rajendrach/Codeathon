import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double pNum =0;
        double nNum =0;
        double zeros =0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]>0){
                pNum++;
            }
            if(arr[arr_i]<0){
                nNum++;
            }
            if(arr[arr_i]==0){
                zeros++;
            }
        }
         pNum = pNum/n;
         nNum = nNum/n;
         zeros = zeros/n;
        System.out.println(pNum);
        System.out.println(nNum);
        System.out.println(zeros);
    }
}
