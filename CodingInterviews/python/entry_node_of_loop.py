# -*- coding:utf-8 -*-
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
'''
选取第一步之前的位置，既可以都在pHead，也可以都在null(下一步是pHead)位置
本例第一步之前的位置都从null开始。
如果第一步之前的位置从null开始，要注意第二次追击时，p2指针第一步之前的位置也要从null开始（即，p2赋值为pHead时，p1要指向下一个节点）
'''
class Solution:
    def EntryNodeOfLoop(self, pHead):
        if pHead == None or pHead.next == None:
            return None
        p1 = pHead          #第一个指针，每次步进一步
        p2 = pHead.next     #第二个指针，每次步进两步
        #第一次追击
        while p1 != p2:
            p1 = p1.next
            p2 = p2.next.next
        p2 = pHead
        p1 = p1.next
        #第二次追击
        while p1 != p2:
            p1 = p1.next
            p2 = p2.next
        return p1