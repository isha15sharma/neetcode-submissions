class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result=new int[m+n];
        for(int i=0;i<m;i++){
            result[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            result[m+j]=nums2[j];
        }
        Arrays.sort(result);
        for(int k=0;k<result.length;k++){
            nums1[k]=result[k];

        }
     
    }
}