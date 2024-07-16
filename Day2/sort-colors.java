class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;

        // First pass: count the number of 0s, 1s, and 2s
        for (int num : nums) {
            switch (num) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }
        int index = 0;
        for (int i = 0; i < count0; i++) {
            nums[index++] = 0;
        }
        for (int i = 0; i < count1; i++) {
            nums[index++] = 1;
        }
        for (int i = 0; i < count2; i++) {
            nums[index++] = 2;
        }
    }
}
