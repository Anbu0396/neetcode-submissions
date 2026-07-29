class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            a.add(nums1[i]);
        }
        for(int i:nums2)
        {
            if(a.contains(i))
                b.add(i);
        }
        int[] ans=new int[b.size()];
        int s=0;
        for(int i:b)
            ans[s++]=i;
        return ans;
    }
}