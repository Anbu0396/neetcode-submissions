class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    a.add(nums1[i]);
                }
            }
        }
        int[] ans=new int[a.size()];
        int s=0;
        for(int i:a)
            ans[s++]=i;
        return ans;
    }
}