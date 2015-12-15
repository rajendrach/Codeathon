public class MergingSortedAlgorithms {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for(int k = 0; k<n; k++){
                nums1[k] = nums2[k];
            }
        }
        int length = m;
        int i, j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(nums2[i]<nums1[j]){
                    for(int p=0;p<m-j;p++){
                        nums1[m-p] = nums1[m-p-1];
                    }
                    nums1[j] = nums2[i];
                    length++;
                    break;
                }
            }
            if(m==length && i< n){
            nums1[length] = nums2[i];
            m++;
            length++;
            }else{
                m++;
            }

        }
    }
}
