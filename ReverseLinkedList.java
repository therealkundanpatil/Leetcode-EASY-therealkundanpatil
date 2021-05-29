package easy;

class ListNode1 {
	int val;
	ListNode1 next;

	ListNode1() {
	}

	ListNode1(int val) {
		this.val = val;
	}

	ListNode1(int val, ListNode1 next) {
		this.val = val;
		this.next = next;
	}
}

public class ReverseLinkedList {
	public ListNode1 reverseList(ListNode1 head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode1 previousNode = null;
		while (head.next != null) {
			ListNode1 nextNode = head.next;
			head.next = previousNode;
			previousNode = head;
			head = nextNode;
		}
		head.next = previousNode;
		return head;
	}
}
