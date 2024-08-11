
package LinkedList;

public class RemoveDuplicateLinkedListll {
	class Node {
		Node next;
		int val;

		public Node(int val) {
			this.next = next;
			this.val = val;
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

	public void addLast(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public Node removeDuplicates() {
		if (head == null || head.next == null) {
			return head;
		}
		Node dummy = new Node(0);
		dummy.next = head;
		Node prev = dummy;
		Node cur = head;
		while (cur != null) {
			while(cur.next!=null && cur.val==cur.next.val) {
				cur = cur.next;
			}
			if(prev.next==cur) {
				prev=prev.next;
			}
			else {
				prev.next=cur.next;
			}
			cur=cur.next;
		}
		return dummy.next;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
		RemoveDuplicateLinkedListll rd = new RemoveDuplicateLinkedListll();
		rd.addFirst(5);
		rd.addFirst(4);
		rd.addFirst(4);
		rd.addFirst(3);
		rd.addFirst(3);
		rd.addFirst(2);
		rd.addFirst(1);
//		rd.print();
//		rd.addLast(3);
//		rd.addLast(2);
//		rd.addLast(1);
//		rd.print();
		rd.removeDuplicates();
		rd.print();
	}
}
