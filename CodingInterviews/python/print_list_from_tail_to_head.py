# -*- coding:utf-8 -*-
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

'''
递归法
'''
class Solution:
    # 返回从尾部到头部的列表值序列，例如[1,2,3]
    def printListFromTailToHead(self, listNode):
        if listNode is None:
            return []
        res = self.printListFromTailToHead(listNode.next)
        res.append(listNode.val)
        return res

if __name__ == '__main__':
    head = ListNode(0)
    pNode = head
    for i in xrange(1,7):
        tempNode = ListNode(i)
        pNode.next = tempNode
        pNode = tempNode
    solution = Solution()
    res = solution.printListFromTailToHead(head)
    print res