package test;

public class stack {

	public static void main(String[] args) {
		Node head=null;
		head=push(head,10);
		head=push(head,40);
		head=push(head,50);
		head=push(head,20);
		head=pop(head);
		display(head);
	}
	static Node push(Node head,int a) {
		if(head==null) {
			head=new Node(a);
		}
		else {
			Node temp=new Node(a);
			temp.right=head;
			head=temp;
		}
		return head;
	}
	static void display(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.right;
			}
	}
	static Node pop(Node head) {
		return head.right;
		
	}

}
