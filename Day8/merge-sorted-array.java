class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[]=new int[m+n];
        int i=0,j=0,k=0;
        if(n==0) return;
        if(m==0){
        for(int p=0;p<n;p++)
           nums1[p]=nums2[p];
        return;
        }
        while(i<m && j<n){ 
            if(nums1[i]<nums2[j] ){
                temp[k]=nums1[i];
                k++;
                i++;
            }
            else if(nums1[i]>nums2[j]){
                temp[k]=nums2[j];
                k++;
                j++;
            }
            else if(nums1[i]==nums2[j]){
                temp[k]=nums1[i];
                temp[++k]=nums2[j];
                k++;
                i++;
                j++;
            }              
        }
        while(j<n){
            temp[k]=nums2[j];
            k++;
            j++;
        }
        while(i<m){
            temp[k]=nums1[i];
            k++;
            i++;
        }
        for(int a=0;a<m+n;a++){
            nums1[a]=temp[a];
        }
    }
}
