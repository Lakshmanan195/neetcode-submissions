class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer>map=new HashMap<>();
       Set<Integer> set=new HashSet<>();
       for(int i=0;i<nums.length;i++){
        if(set.contains(target-nums[i])){
            return new int[]{map.get(target-nums[i]),i};
        }
        map.put(nums[i],i);
        set.add(nums[i]);
       } 
       return new int[]{0,1};
    }
}
