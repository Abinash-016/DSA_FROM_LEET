class Solution {
    public int maxSubArray(int[] nums) {
        int currMax=nums[0];
        int maxSofar=nums[0];

        for(int i=1;i<nums.length;i++){
            currMax=Math.max(nums[i], currMax+nums[i]);
            maxSofar= Math.max(currMax, maxSofar);
        }
        return maxSofar;
    }
}