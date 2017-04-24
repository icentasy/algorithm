package algorithm;

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class DeleteDuplicationNode {
	public static ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null)
            return null;
		ListNode newHead = null, preNode = null;
		ListNode curNode = pHead;
		ListNode nextNode = curNode.next;
		int sameNum = 0;
		while (nextNode != null) {
			if (curNode.val != nextNode.val && sameNum == 0) {
				if (newHead == null)
					newHead = preNode = curNode;
				else{
					preNode.next = curNode;
					preNode = curNode;
				}
				curNode = nextNode;
			} else if (curNode.val != nextNode.val && sameNum > 0) {
				curNode = nextNode;
				sameNum = 0;
			} else {
				sameNum++;
			}
			nextNode = nextNode.next;
		}
		if (preNode == null && sameNum == 0) {
			newHead = curNode;
			newHead.next = null;
		} else if (sameNum == 0){
			preNode.next = curNode;
		}
		else if(preNode != null)
			preNode.next = null;
		return newHead;
	}

	public static void main(String[] args) {
		int[] arr = {1,1,1,1,1,1,1};
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
		deleteDuplication(head);
		while (head != null){
			System.out.println(head.val);
			head = head.next;
		}
	}
}