//Using link list via jaba
public class UsingLinkList{
static class Node{
	int data;
	Node next;

	Node(int data){
		this.data = data;
		this.next = null;
	}
}


	public static void main(String[] args){
		System.out.println("Link List is Started");
		Node head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);

		head.next = second;
		second.next =third;
		
		//Traversing the link list
		// Node temp = head;
		// while(temp!=null){
		// System.out.println(temp.data);
		// temp=temp.next;
		// }

		//Insert new node at beginning
		// Node newNode = new Node(5);
		// newNode.next = head;
		// head= newNode;

		// Node temp = head;
		// while(temp!=null){
		// System.out.println(temp.data);
		// temp=temp.next;
		// }

		//insert new node at end
		// Node newNode = new Node(40);

		// Node temp = head;
		// while(temp.next!=null){
		// 	temp = temp.next;
		// }
		// temp.next= newNode;

		// temp=head;
		// while(temp!=null){
		// 	System.out.println(temp.data);
		// 	temp=temp.next;
		// }

		//Insert new node at specific position
		Node newNode = new Node(15);

		int position = 2;

		Node temp = head;

		for(int i=0;i<position-1; i++){
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next=newNode;

		temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
}