class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Set<Integer> uni=new TreeSet<>();
        for(int i:nums)
        {
            uni.add(i);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!uni.contains(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }
}