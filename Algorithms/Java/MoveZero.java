public class Solution {
    public void moveZeroes(int[] nums) {
        int count =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
              //count++;
               int temp = nums[i];
               int index= i+1;
               while(index<nums.length){
                   if(nums[index]!=0){
                       break;
                   }
                   index++;
               }
               if(index<nums.length){
               nums[i]=nums[index];
               nums[index]=temp;
               }
            }
        }
        
    }
}
