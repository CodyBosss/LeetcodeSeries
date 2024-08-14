//Given head, the head of a linked list, determine if the linked list has a cycle in it.
//
//There is a cycle in a linked list if there is some node in the list that can be reached 
//again by continuously following the next pointer. Internally, pos is used to denote the 
//index of the node that tail's next pointer is connected to. Note that pos is not passed as 
//a parameter.
//
//Return true if there is a cycle in the linked list. Otherwise, return false. 
//
//Example 1:
//
//Input: head = [3,2,0,-4], pos = 1
//Output: true
//Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
//
//Example 2:
//
//Input: head = [1,2], pos = 0
//Output: true
//Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
//
//Example 3:
//
//Input: head = [1], pos = -1
//Output: false
//Explanation: There is no cycle in the linked list.

package LinkedList;

public class LinkedListCycle {
	class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
			this.next = null;
		}
	}

	Node head;

	public void addFirst(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public boolean listCycle() {
		if (head == null || head.next == null) {
			return false;
		}
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true; // Cycle detected
			}
		}
		return false; // No cycle
	}

	public void print() {
		if (listCycle()) {
			System.out.println("Cannot print the list, it contains a cycle.");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
		LinkedListCycle llc = new LinkedListCycle();
		llc.addFirst(3);
		llc.addFirst(2);
		llc.addFirst(0);
		llc.addFirst(-4);

		// Manually create a cycle for testing
		llc.head.next.next.next.next = llc.head.next; // Creating a cycle (4 -> 2)

		if (llc.listCycle()) {
			System.out.println("The linked list contains a cycle.");
		} else {
			System.out.println("The linked list does not contain a cycle.");
		}

		llc.print();
	}
}
