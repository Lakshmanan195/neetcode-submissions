class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pref=new int[nums.length];
        Arrays.fill(pref,1);
        int[] suff=new int[nums.length];
        Arrays.fill(suff,1);
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]*nums[i];
        }
       // System.out.println(Arrays.toString(pref));
        suff[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suff[i]=suff[i+1]*nums[i];
        }
        //System.out.println(Arrays.toString(suff));
        nums[0]=suff[1];
        for(int i=1;i<nums.length-1;i++){
           // System.out.println(pref[i-1]+" "+suff[i+1]);
            nums[i]=pref[i-1]*suff[i+1];
        }
        nums[nums.length-1]=pref[nums.length-2];
        return nums;
    }
}  
