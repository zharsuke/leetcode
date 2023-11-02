class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]
        return None

nums = [2, 7, 11, 15]
target = 9
result = Solution().twoSum(nums, target)
print(result[0], " ", result[1])