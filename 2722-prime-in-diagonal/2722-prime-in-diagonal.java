class Solution {
    public int diagonalPrime(int[][] nums) {
        
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            boolean bool=true;
            if(nums[i][i]==0 || nums[i][i]==1 )
                bool=false;
            for(int k=2;k<=Math.sqrt(nums[i][i]);k++){
                if(nums[i][i]%k==0){
                    bool=false;
                    break;
                }
            }
            if(bool==true)
                ans=Math.max(ans,nums[i][i]);

            
            boolean bool2=true;
            int b=nums[i][nums.length - i - 1];
            if(nums[i][nums.length - i - 1]==0 || nums[i][nums.length - i - 1]==1)
            bool2=false;
            for(int k=2;k<=Math.sqrt(b);k++){
                if(b%k==0){
                    bool2=false;
                    break;
                }
            }
            if(bool2==true){
                ans=Math.max(ans,b);
            }
        }
        return ans==Integer.MIN_VALUE?0:ans;
    }
}