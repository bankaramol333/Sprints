package LinkedList;

class Node1 {
	int val;
	Node1 next;

	public Node1(int x) {
		this.val = x;
		this.next = null;
	}
}

public class SourceQ1 {
	public static void main(String[] args) {
		Node1 n1 = new Node1(3);
		Node1 n2 = new Node1(6);
		Node1 n3 = new Node1(8);
		Node1 n4 = new Node1(1);
		Node1 n5 = new Node1(344);
		Node1 n6 = new Node1(6);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = null;
		Node1 head = n1;
		Node1 temp = head;
		System.out.println("Printing List");
		while (temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
}
