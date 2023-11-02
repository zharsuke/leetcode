class Solution:
    def isPalindrome(self, x: int) -> bool:
        if (x < 0 or (x != 0 and x % 10 == 0)):
            return False
        if x == 0:
            return True
        reversedNumber = 0
        while x > reversedNumber:
            reversedNumber = reversedNumber * 10 + x % 10
            x = x // 10
        return x == reversedNumber or x == reversedNumber // 10
        
number = 1221
result = Solution().isPalindrome(number)
print(number, " = ", result)