import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            int[][] gArray = new int[R][C];
            for(int G_i=0; G_i < R; G_i++){
                String numberG = in.next();
                for(int j = 0;j<C;j++){
                    gArray[G_i][j] = Character.getNumericValue(numberG.charAt(j));
                }
                
            }
            int r = in.nextInt();
            int c = in.nextInt();
            int[][] pArray = new int[r][c];
            for(int P_i=0; P_i < r; P_i++){
                String numberP = in.next();
                for(int j = 0;j<c;j++){
                    pArray[P_i][j] = Character.getNumericValue(numberP.charAt(j));
                }
            }
            System.out.println(findPattern(gArray, pArray));
        }
    }
    
    public static String findPattern(int[][] gArray, int[][] pArray){
        for(int R=0; R < gArray.length - pArray.length+1;R++){
            for(int C=0; C < gArray[0].length - pArray[0].length +1;C++){
                innerLoop:
                for(int r =0 ; r< pArray.length;r++){
                    for(int c=0; c<pArray[0].length;c++){
                        if(gArray[R+r][C+c]!=pArray[r][c]){
                            break innerLoop;
                        }
}
                    if(r == pArray.length -1){
                        return "YES";
                    }
                    }
                }
            
        }
        return "NO";
}
}
