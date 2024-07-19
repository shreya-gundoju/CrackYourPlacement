class Solution {
    public int maxArea(int[] height) {
        int i = 0,j = height.length - 1, mx = Integer.MIN_VALUE;
    	while(i < j)
    	{
    		int water = (j-i)* Math.min(height[i],height[j]);
    		mx = Math.max(mx,water);
    		if(height[i] < height[j])
    		    i++;
    		else
    		    j--;
    	}
        return mx;
    }
}
