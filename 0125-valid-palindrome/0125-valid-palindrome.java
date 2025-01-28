class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder res= new StringBuilder();
        for(char c : s.toCharArray()){
            if(c >='a' && c <='z' || c>='0' && c<='9'){
                res.append(c);
            }
        }
        String ans=res.toString();
        int l=0;
        int r=ans.length()-1;
        while(l<=r){
            if(ans.charAt(l) != ans.charAt(r)){
                return false;
            }
            l++;
            r--;

        }
        return true;

    }
}