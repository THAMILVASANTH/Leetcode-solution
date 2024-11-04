class Solution {
    public int maxFrequencyElements(int[] n) {
        int arr[] = new int[101];
        for(int i=0;i<n.length;i++){
            arr[n[i]]++;
        }
        Arrays.sort(arr);
        int s=arr.length;
        int j=2;
        int c=arr[s-1];
        while(s>=0 && arr[s-j] == arr[s-j+1]){
            c+=arr[s-j];
            j++;
        }
        if(c>arr[s-1]){
            return c;
        }else{
            return arr[s-1];
        }

        }
}