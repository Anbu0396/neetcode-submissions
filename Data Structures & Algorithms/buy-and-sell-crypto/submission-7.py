class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        ans=0
        i=0
        j=1
        while(j<len(prices)):
            if(prices[j]>prices[i]):
                current=prices[j]-prices[i]
                ans=max(current,ans)
            else:
                i=j
            j+=1
        return ans
        