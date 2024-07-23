class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length();
        int left=0,right=n-1;
        String temp;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
    private boolean isPalindrome(String s, int startIndex, int endIndex) {
        for (int i = startIndex, j = endIndex; i < j; ++i, --j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
