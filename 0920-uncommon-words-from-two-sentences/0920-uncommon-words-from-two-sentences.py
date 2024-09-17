class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        new = s1+ ' ' + s2
        arr=new.split()
        ans=[]
        for w in arr:
            if arr.count(w)==1:
                ans.append(w)
        return ans