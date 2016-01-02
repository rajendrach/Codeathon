public class NumArray {
    
    int[] nums;
    int[] sums;

    public NumArray(int[] nums) {
        this.nums = nums;
        if(nums==null){
            return;
        }
        sums = new int[nums.length+1];
       for (int i=1; i<=nums.length; i++) {
            sums[i] = sums[i-1] + nums[i-1];
        }
    }

    public int sumRange(int i, int j) {
        return sums[j+1] - sums[i];
    }
}
