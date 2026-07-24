class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] a=new int[2];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                a[0]=nums[i];
        }
        Set<Integer> u=new HashSet<>();
        for(int i:nums)
        {
            u.add(i);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!u.contains(i))
            {
                a[1]=i;
            }
        }
        return a;
    }
}