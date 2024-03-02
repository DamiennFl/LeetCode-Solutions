class Solution(object):
    def sortedSquares(self, nums):

        for i in range(len(nums)):
            nums[i] = nums[i] ** 2
        
        nums.sort()
        return nums

        # Complete in-line example
        # class Solution(object):
        # def sortedSquares(self, nums):
        # return sorted([num**2 for num in nums])