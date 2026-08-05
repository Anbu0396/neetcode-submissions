class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> a=new HashSet<>();
        for(int i:nums)
            a.add(i);
        int[] b=new int[a.size()];
        int i=0;
        for(int c:a)
            b[i++]=c;
        Arrays.sort(b);
        int l=0,j=1;
        i=0;
        if(b.length==1)
            return 1;
        while(i<b.length-1)
        {
            if(b[i+j]==b[i]+j)
            {
                j++;
                if(j>l)
                    l=j;
            }
            else
            {
                j=0;
                i++;
            }
            if(i+j==b.length)
                break;
        }
        return l;
    }
}
