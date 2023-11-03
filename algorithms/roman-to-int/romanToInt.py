class Solution:
    def romanToInt(self, s: str) -> int:
        result = 0
        data = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        }
        for i in range(len(s)):
            if i+1 < len(s) and data.get(s[i]) < data.get(s[i+1]):
                result -= data.get(s[i])
            else:
                result += data.get(s[i])
        return result
    
data = "IX"
result = Solution().romanToInt(data)
print(data, " = ", result)