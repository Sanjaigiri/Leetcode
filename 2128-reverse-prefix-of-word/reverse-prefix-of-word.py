class Solution(object):
    def reversePrefix(self, word, ch):
        ans =[]
        if ch not in word:
          return word

        Res = word.find(ch)
        ans = word[:Res+1][::-1] + word[Res+1:]

        return ans
        