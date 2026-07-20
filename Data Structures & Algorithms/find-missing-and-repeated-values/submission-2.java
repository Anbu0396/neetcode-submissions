class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int t=grid.length*grid[0].length;
        int[] ans={0,0};
        int a=0,to=0;
        int[] ar=new int[t];
        for(int i=1;i<=t;i++)
        {
            a=a+i;
        }
        int s=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                ar[s++]=grid[i][j];
                to+=grid[i][j];
            }
        }
        Arrays.sort(ar);
        for(int i=0;i<t-1;i++)
        {
            if(ar[i]==ar[i+1])
            {
                ans[0]=ar[i];
            }
        }
        to=to-ans[0];
        ans[1]=a-to;
        return ans;
    }
}