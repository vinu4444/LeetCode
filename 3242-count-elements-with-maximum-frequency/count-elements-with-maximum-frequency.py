from collections import Counter
class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        freq=Counter(nums)
        max_freq=max(freq.values())
        return sum(i for i in freq.values() if i==max_freq)