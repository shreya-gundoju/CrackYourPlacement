import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length,dup=0;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
          if(nums[i]==nums[i-1])
            dup=nums[i];
        }
        return dup;
    }
}
