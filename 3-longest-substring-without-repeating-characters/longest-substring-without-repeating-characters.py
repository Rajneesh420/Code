class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen = {}
        left = ma = 0
        for i, ch in enumerate(s):
            if ch in seen and seen[ch] >= left:
                left = seen[ch] + 1          
            ma = max(ma, i - left + 1)       
            seen[ch] = i                     
        return ma
                 