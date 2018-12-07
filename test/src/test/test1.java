package test;


public class test1
{
	public static void main(String[] args){
		node head=null;
		head=test1.add(head, 1);
		head=test1.add(head, 2);
		head=test1.add(head, 3);
		head=test1.add(head, 4);
		test1.printe(head);
		
	}
	static node add(node head,int data){
		if(head==null) {
			head=new node(data);
			return head;
		}
		node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=new node(data);
		return head;
	}
	static void printe(node head) {
		node temp=head;
		while(temp.next!=null) {
			System.out.println(temp.data);
		}
	}
}

class node{
	int data;
	node next;
	node(int d){
		data=d;
		next=null;
	}
}