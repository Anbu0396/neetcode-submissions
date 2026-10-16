class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        uni=set(nums)
        nums=list(uni)
        nums.sort()
        large=0
        current=1
        if(nums==[]):
            return 0
        for i in range(1,len(uni)):
            if(nums[i-1]+1==nums[i]):
                current+=1
            else:
                if(current>large):
                    large=current
                current=1
        if(current>large):
                    large=current
        return large



