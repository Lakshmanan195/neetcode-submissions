class Solution:
    def reverse(self, x: int) -> int:
        max_int=0x7FFFFFFF
        min_int=-0x80000000
        y=abs(x)
        st=str(y)
        st=st[::-1]
        num=int(st)
        if(x<0):
            num*=-1;
        if(num>=min_int and num<=max_int):
            return num
        return 0 
        
        