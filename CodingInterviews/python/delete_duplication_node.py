# -*- coding:utf-8 -*-
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

'''
递归实现
'''
class Solution:
    def deleteDuplication(self, pHead):
        # write code here
        if pHead is None:
            return None;
        nextNode = pHead.next
        if nextNode is None:
            return pHead
        sameNum = 0
        while nextNode.val == pHead.val:
            nextNode = nextNode.next
            sameNum += 1
            if nextNode is None:
                break;
        if sameNum > 0:
            return self.deleteDuplication(nextNode)
        else:
            pHead.next = self.deleteDuplication(nextNode)
            return pHead