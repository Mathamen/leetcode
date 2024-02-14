class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        pos = [num for num in nums if num > 0]
        neg = [num for num in nums if num < 0]

        res = []

        while pos and neg:
            res.append(pos.pop(0))
            res.append(neg.pop(0))

        res += pos + neg

        return res
