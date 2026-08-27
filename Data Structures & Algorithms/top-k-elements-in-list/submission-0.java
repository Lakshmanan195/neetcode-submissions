class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(b[1],a[1]));
        for(int key:map.keySet()){
            pq.add(new int[]{key,map.get(key)});
        }
        int[] arr=new int[k];
        int i=0;
        while(k-->0){
           arr[i++]=pq.poll()[0]; 
        }
        return arr;
    }
}
