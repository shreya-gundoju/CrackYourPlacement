class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int left=0,right=1;
        while(left<=right && right<n){
            int diff=arr[right]-arr[left];
            if(diff==x && left!=right)
                return 1;
            else if(diff>x)
                left++;
            else
                right++;
        }
        return -1;
    }
}
