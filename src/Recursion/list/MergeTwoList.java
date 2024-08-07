package Recursion.list;

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

public class MergeTwoList {
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		// Create a dummy node to act as the head of the merged list
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;

		// While both lists have nodes left to compare
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				current.next = list1;
				list1 = list1.next;
			} else {
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}

		// If one of the lists is exhausted, link the rest of the other list
		if (list1 != null) {
			current.next = list1;
		} else {
			current.next = list2;
		}

		// Return the merged list, which starts from dummy's next
		return dummy.next;
	}

	public static void main(String[] args) {
		// Example usage
		ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5))));
		ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(6))));

		ListNode mergedList = mergeTwoLists(list1, list2);

		// Print merged list
		while (mergedList != null) {
			System.out.print(mergedList.val + " ");
			mergedList = mergedList.next;
		}
	}
}
