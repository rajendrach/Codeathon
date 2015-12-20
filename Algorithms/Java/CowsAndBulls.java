public class Solution {
    public String getHint(String secret, String guess) {
        int aCount, bCount;
        aCount = bCount = 0;
        int[] secret_counter =  new int[10];
        int[] guess_counter = new int[10];
        for(int i=0;i<secret.length();i++){
            secret_counter[secret.charAt(i)-'0']++;
            
            if(secret.charAt(i) == guess.charAt(i)){
                aCount++;
                secret_counter[secret.charAt(i)-'0']--;
            }else{
                guess_counter[guess.charAt(i)-'0']++;
            }
        }
        
        for(int j=0;j<=9;j++){
                bCount+= secret_counter[j]>=guess_counter[j]?guess_counter[j]:secret_counter[j];
            }
            
            return aCount+"A"+bCount+"B";
    }
      
}
