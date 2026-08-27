class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
       List<Integer>[] arr=new List[nums.length+1];
       for(int key:map.keySet()){
        int freq=map.get(key);
        if(arr[freq]==null){
            List<Integer> list=new ArrayList<>();
            list.add(key);
            arr[freq]=list;
        }
        else{
            List<Integer> list=arr[freq];
            list.add(key);
            arr[freq]=list;
        }
       }
       int[] ll=new int[k];
       int l=0;
       for(int i=arr.length-1;i>=0&&k>0;i--){
        if(arr[i]!=null){
            for(int j=0;j<arr[i].size()&&k-->0;j++){
                ll[l++]=arr[i].get(j);
            }

        }
       }
       return ll;
    }
}
