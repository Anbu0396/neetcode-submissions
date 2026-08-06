class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=nums[0];
        int currentSum = nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                currentSum += nums[i+1];
            }
            else
            {
                currentSum = nums[i+1];
            }
            max = Math.max(max, currentSum);
        }
        return max;
    }
}