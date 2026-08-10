class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashset=set()
        d={}
        for i in range(len(nums)):
            if(target-nums[i] in hashset):
                return [d[target-nums[i]],i]
            hashset.add(nums[i])
            d[nums[i]]=i
        
            
        