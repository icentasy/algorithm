# -*- coding:utf-8 -*-
class Solution:
    '''
    递归方式，开销较大
    '''
    def jumpFloor(self, number):
        if number == 1:
            return 1
        if number == 2:
            return 2
        return self.jumpFloor(number - 1) + self.jumpFloor(number - 2)

    '''
    从斐波那契角度用循环实现
    '''
    def jumpFloor1(self, number):
        if number == 1 or number == 2:
            return number
        number1 = 1
        number2 = 2
        for flag in xrange(3, number):
            tempSum = number1 + number2
            number1 = number2
            number2 = tempSum
        return number1 + number2

if __name__ == '__main__':
    solution = Solution()
    print solution.jumpFloor1(4)