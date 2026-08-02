class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,t=0,a=0;
        for(int i=1;i<=n;i++)
        {
            t+=i;
        }
        for(int i:nums)
        {
            a+=i;
        }
        return t-a;
    }
}
