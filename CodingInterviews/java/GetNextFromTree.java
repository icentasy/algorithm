package algorithm;

class TreeLinkNode {
	int val;
	TreeLinkNode left = null;
	TreeLinkNode right = null;
	TreeLinkNode next = null;

	TreeLinkNode(int val) {
		this.val = val;
	}
}

public class GetNextFromTree {
	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		if (pNode == null)
			return null;
		if (pNode.right != null) {
			pNode = pNode.right;
			while (pNode.left != null)
				pNode = pNode.left;
			return pNode;
		} else {
			do {
				TreeLinkNode tempNode = pNode;
				pNode = pNode.next;
				if (pNode == null || pNode.left == tempNode)
					return pNode;
			} while (true);
		}
	}
}