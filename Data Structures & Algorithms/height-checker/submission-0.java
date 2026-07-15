class Solution {
    public int heightChecker(int[] heights) {
        int[] temp=heights.clone();
        Arrays.sort(heights);
        int t=0;
        System.out.println(temp);
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=temp[i])
                t++;
        }
        return t;
    }
}