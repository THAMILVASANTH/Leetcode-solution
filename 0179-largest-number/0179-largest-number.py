class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        def compare(a,b):
            if a+b>b+a:
                return -1
            elif b+a>a+b:
                return 1
            else:
                return 0
        res=[str(i) for i in nums]
        res.sort(key=cmp_to_key(compare))
        return str(int(''.join(res)))


        