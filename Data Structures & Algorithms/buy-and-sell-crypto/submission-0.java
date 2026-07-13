class Solution {
    public int maxProfit(int[] prices) {
        int b=0,s=1,p=0;
        while(s<prices.length)
        {
            if(prices[s]>prices[b])
            {
                int cp=prices[s]-prices[b];
                if(cp>p)
                    p=cp;
            }
            else
                b=s;
            s++;
        }
        return p;
    }
}
