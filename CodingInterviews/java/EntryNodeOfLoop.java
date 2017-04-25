package algorithm;

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class EntryNodeOfLoop {
	public static ListNode EntryNodeOfLoop(ListNode pHead) {
		if (pHead == null || pHead.next == null)
			return null;
		/*选取第一步之前的位置，既可以都在pHead，也可以都在null(下一步是pHead)位置
		 * 本例第一步之前的位置都从pHead开始。
		 * 如果第一步之前的位置从null开始，要注意第二次追击时，p2指针第一步之前的位置也要从null开始（即，p2赋值为pHead时，p1要指向下一个节点）
		 */
		ListNode p1 = pHead;	//第一个指针，每次步进一步
		ListNode p2 = pHead;	//第二个指针，每次步进两步
		//第一次追击
		do {
			p1 = p1.next;
			p2 = p2.next.next;
		} while (p1 != p2);
		//第二次追击
		p2 = pHead;
		while (p2 != p1) {
			p2 = p2.next;
			p1 = p1.next;
		}
		return p1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
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
		ListNode loopHead = null;
		for (int i : arr2) {
			ListNode node = new ListNode(i);
			if (loopHead == null) {
				loopHead = node;
			}
			preNode.next = node;
			preNode = node;
		}
		preNode.next = loopHead;
		ListNode entry = EntryNodeOfLoop(head);
		System.out.println(entry.val);
	}
}