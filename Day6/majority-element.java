class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if(count>(n/2))
            return nums[i];
        }
        return -1;
    }
}
