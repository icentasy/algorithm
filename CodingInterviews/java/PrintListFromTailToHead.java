package algorithm;

import java.util.ArrayList;

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class PrintListFromTailToHead {
	/* 顺序遍历链表，反转链表，最后遍历新链表并顺序获取val */
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ListNode newHead = null;
		ListNode pNode = listNode;
		while(pNode != null){
			if(newHead == null){
				newHead = pNode;
				pNode = pNode.next;
				newHead.next = null;
			}
			else{
				ListNode tempNode = pNode;
				pNode = pNode.next;
				tempNode.next = newHead;
				newHead = tempNode;
			}
		}
		ArrayList<Integer> resList = new ArrayList<Integer>(); 
		if(newHead == null)
			return resList;
		while(newHead != null){
			resList.add(newHead.val);
			newHead = newHead.next;
		}
		return resList;
    }

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3};
		ListNode preNode = null;
		ListNode head = null;
		for (int i : arr) {
			ListNode node = new ListNode(i);
			if (preNode == null) {
				preNode = node;
				head = preNode;
			} else {
				preNode.next = node;
				preNode = node;
			}

		}
		ArrayList res = printListFromTailToHead(head);
		System.out.println(res);
	}
}