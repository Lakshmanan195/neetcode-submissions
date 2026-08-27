class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String str:strs){
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            int strt=i;
            int j=i;
            while(str.charAt(j)!='#'){
                j+=1;
            }
            int length=Integer.parseInt(str.substring(i,j));
            j+=1;
            String word=str.substring(j,j+length);
            list.add(word);
            i=j+length-1;
        }
        return list;
    }
}
