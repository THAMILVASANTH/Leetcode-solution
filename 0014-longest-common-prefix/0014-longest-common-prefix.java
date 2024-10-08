class Solution {
    public String longestCommonPrefix(String[] strs) {
        String iterator=strs[0];
        for(int i=1;i<strs.length;i++){
            int count=iterator.length();
            while(!strs[i].startsWith(iterator) && count>0){
                iterator=iterator.substring(0,--count);
            }
        }
        return iterator;  
    }
}