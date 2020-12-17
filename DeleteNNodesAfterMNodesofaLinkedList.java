package easy;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

/**
 * LeetCode Easy
 * 
 * Id: Delete N nodes after M nodes of a linkedlist
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(1)
 * 
 * 
 * @author Kundan
 *
 */
public class DeleteNNodesAfterMNodesofaLinkedList {
	public ListNode deleteNodes(ListNode head, int m, int n) {
		ListNode currentNode = head;

		int i = 1;
		int j = 0;

		while (currentNode != null) {

			while (i < m && currentNode != null) { 
				currentNode = currentNode.next;
				i++;
			}

			i = 0;
			j = 0;

			while (j < n && currentNode != null && currentNode.next != null) { 
				currentNode.next = currentNode.next.next;
				j++;
			}
		}

		return head;
	}
}
