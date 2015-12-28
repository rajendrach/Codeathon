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
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        System.out.println(arr.length);
        cutIntoPieces(arr);
    }
    
    public static void cutIntoPieces(int[] arr){
        int count =0;
        int min = arr[0];
        for(int i =0; i<arr.length; i++){
            if(min!=0){
            if(arr[i]<min && arr[i]!=0){
                min = arr[i];
            }
        }else{
                min = arr[i];
            }
        }
        for(int j = 0; j<arr.length;j++){
            if(arr[j]>0){
                arr[j] = arr[j] - min;
                if(arr[j]!=0 && arr[j]>0 ){
                    count++;
                }
            }
            
        }
        if(count!=0){
                    System.out.println(count);
                cutIntoPieces(arr);
        }
        
    }
}
