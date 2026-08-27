class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            if(map.containsKey(key)){
                List<String> list=map.get(key);
                list.add(strs[i]);
                map.put(key,list);
            }
            else {
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(key,list);
            }
        }
        List<List<String>> list=new ArrayList<>();
        for(String key:map.keySet()){
            list.add(map.get(key));
        }
        return list;
    }
}
