# -*- coding:utf-8 -*-
class Solution:
    def StrToInt(self, s):
        s = s.strip()
        if len(s) == 0:
            return 0;
        symbol = 1
        if s[0] == '-':
            symbol = -1
            s = s[1:]
        elif s[0] == '+':
            s = s[1:]
        res = 0
        for c in s:
            if c > '9' or c < '0':
                return 0
            res = (res << 1) + (res << 3) + (ord(c) & 0xf)
        return res * symbol

if __name__ == '__main__':
    solution = Solution()
    print solution.StrToInt('-123')