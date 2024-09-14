class Solution {
    public int longestSubarray(int[] nums) {
        int len=0,max=0;
       int i,n=nums.length;
       for(i=0;i<n;i++)
       {
            max=Math.max(max,nums[i]);
       }
       int c=0;
       for(i=0;i<n;i++)
       {
        if(nums[i]==max){
            c++;
            len=Math.max(len,c);
        }
        else{
            c=0;
        }

       }
       return len;

    }
}