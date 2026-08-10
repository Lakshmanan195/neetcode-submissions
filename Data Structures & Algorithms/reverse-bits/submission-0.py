class Solution:
    def reverseBits(self, n: int) -> int:
        ans=0
        for i in range(0,32):
            if(((1<<i)&n)>0):
                ans+=2**(31-i)
               
        return ans
        
        