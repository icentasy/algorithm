# -*- coding:utf-8 -*-
class Solution:
    '''
    本例使用公式（2）实现
    f(n) = f(n-1) + f(n-2) + …… + f(1)         公式（1）
    f(n-1) = f(n-2) + f(n-3) + …… + f(1)
    所以f(n) = 2*f(n-1)
    而且f(1) = 1
    所以f(n) = 2^(n-1)                         公式（2）
    '''
    def jumpFloorII(self, number):
        return 1<<(number-1)

if __name__ == '__main__':
    solution = Solution()
    print solution.jumpFloorII(4)