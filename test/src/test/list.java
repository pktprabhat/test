package test;

public class list {
	linked_list head=null;
	
	void addtofront(int i) {
		if(head==null) {
		head=new linked_list();
		head.data=i;
		head.next=null;
		}
		else {
		linked_list node=new linked_list();
		node.data=i;
		node.next=head;
		head.next=node;
		}
	}
	void printlist() {
		linked_list curr=head;
		while(curr!=null) {
			System.out.println(curr.data+" ");
			curr=curr.next;
		}
	}
}
