class Solution {
    public int compress(char[] chars) {
         int l=0,r=0,k=0;
            int n=chars.length;
            while(r<n){
                while(r<n && chars[r]==chars[l] ) {
                    r++;
                }
                chars[k++]=chars[l];
                int num=  r-l;
                 if (num>1) {
                String countStr = Integer.toString(num);
                for (char c : countStr.toCharArray()) {
                    chars[k++] = c;
                }
            }
                l=r;

            }
            return k;
    }
}