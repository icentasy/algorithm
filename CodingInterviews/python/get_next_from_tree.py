# -*- coding:utf-8 -*-
class TreeLinkNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
        self.next = None

class Solution:
    def GetNext(self, pNode):
        if pNode is None:
            return None
        if pNode.right is not None:
            pNode = pNode.right
            while pNode.left is not None:
                pNode = pNode.left
            return pNode
        else:
            while True:
                tempNode = pNode
                pNode = pNode.next
                if pNode is None or pNode.left == tempNode:
                    return pNode

if __name__ == '__main__':
    solution = Solution()
    print solution.StrToInt('-123')