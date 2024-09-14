class Solution {
    public int countPrimes(int n) {
      boolean a[]=new boolean[n];
      long i,j,c=0;
      for(i=2;i<n;i++)
      {
        if(a[(int)i])
        continue;
        c++;
        for(j=i*i;j<n;j+=i)
        {
            a[(int)j]=true;
        }
      } 
      return (int)c; 
    }
}