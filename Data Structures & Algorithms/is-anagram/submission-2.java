class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i)-'a';
            arr[ch]+=1;
        }
        for(int i=0;i<t.length();i++){
            int ch=t.charAt(i)-'a';
            arr[ch]-=1;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }
}
