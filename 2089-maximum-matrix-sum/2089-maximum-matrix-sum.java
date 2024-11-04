class Solution {
    public long maxMatrixSum(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int neg=0;
        long s=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num=Math.abs(mat[i][j]);
                if(mat[i][j]<0)
                    neg++;
                s+=num;
                min=Math.min(min,num);
            }
        }
        return neg%2 ==0? s : s-2*min;
    }
}