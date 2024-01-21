class Solution:
    def isPalindrome(self, x: int) -> bool:
        s = str(x)
        array = list(s)

        for i in range(len(array) // 2):
            if array[i] != array[len(array) - 1 - i]:
                return False

        return True