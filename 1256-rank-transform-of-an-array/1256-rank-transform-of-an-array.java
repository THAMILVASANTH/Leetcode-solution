class Solution {
    public int[] arrayRankTransform(int[] a) {
        TreeMap<Integer, Integer>map=new TreeMap<>();
        for(int v : a){
            map.put(v,map.getOrDefault(v,0)+1);
        }
        int r=1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            map.put(entry.getKey(), r);
            r++;
        }
        int[] ans=new int[a.length];
        for(int i=0;i<a.length;i++){
            ans[i]=map.get(a[i]);
        }
        return ans;
    }
}