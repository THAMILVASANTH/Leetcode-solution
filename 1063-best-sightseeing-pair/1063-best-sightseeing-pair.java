class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n=values.length;

        int iSite=values[0]+0;        
        int maxScore=0;
        for(int i=1; i<n; i++){
            maxScore=Math.max(maxScore, iSite+values[i]-i);
            iSite=Math.max(iSite, values[i]+i);
        }


        return maxScore;
    }
}