class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int a=0,b=100000;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            
            if(m.containsKey(nums[i]))
            {
                a=m.get(nums[i]);
                b=i;
            }
            m.put(nums[i],i);
        }
        return Math.abs(a-b)<=k;
    }
}