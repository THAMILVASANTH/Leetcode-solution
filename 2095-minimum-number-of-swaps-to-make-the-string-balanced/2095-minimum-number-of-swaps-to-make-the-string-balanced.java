class Solution {
    public int minSwaps(String s) {
        int si=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='[')
                si++;
            else if(si>0)
                si--;
        }
        return (si+1)/2;
    }
}