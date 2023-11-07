class Solution:
    def longestCommonPrefix(self, strs: list[str]) -> str:
        if strs == None or len(strs) == 0:
            return ""
        result  = ""
        for i in range(len(strs[0])):
            currentChar = strs[0][i]
            for j in range(1, len(strs)):
                if i >= len(strs[j]) or strs[j][i] != currentChar:
                    return result
            result += currentChar
        return result
    
str = ["flower","flow","flight"]
result = Solution().longestCommonPrefix(str)
print(str, " -> ", result)