import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int c=1;
        ArrayList<Integer> dup = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                dup.add(nums[i]);
                c++;
            }
        }
        return dup;
    }
}
