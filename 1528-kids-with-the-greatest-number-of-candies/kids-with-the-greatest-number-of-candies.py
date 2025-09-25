class Solution:
    def kidsWithCandies(self, candies, extraCandies):
        maxCandies = max(candies)
        return [c + extraCandies >= maxCandies for c in candies]
