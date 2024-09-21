class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>(n);
        int c=1;

        for (int i=0;i<n;i++) {
            ans.add(c);
            if (c*10<=n) {
                c*=10;
            } else {
                while (c%10==9 || c+1>n) {
                    c/=10;
                }
                c++;
            }
        }
        
        return ans;
    }
}