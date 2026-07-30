class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> a=new HashMap<>();
        int h=0,n=0;
        for(int i:nums)
        {
            if(a.containsKey(i))
            {
                a.put(i,a.get(i)+1);
            }
            else
            {
                a.put(i,1);
            }
        }
        for(Integer i:a.keySet())
        {
            if(a.get(i)>h)
            {
                h=a.get(i);
                n=i;
            }
        }
        return n;
    }
}