 package test;

import java.util.*;
import java.time.*;

public class imple {
	
	static 	linklistnode head=null;
	public static void add(int n){
		linklistnode new1=new linklistnode(n);
		if(head==null) {
			head=new1;
		}
		else {
			linklistnode temp=head;
			while(temp.getnext()!=null) {
				temp=temp.next;
			}
			temp.next=new1;
			new1.next=head;
		}
	}
	public static void addtofront(int n) {
		linklistnode new1=new linklistnode(n);
		if(head==null) {
			head=new1;
		}
		else {
			new1.next=head;
			head=new1;
		}
	}
		
	public static void printhead() {
		System.out.print(head.value);
	}
	
	public static void printlist() {
		linklistnode temp=head;
		//ArrayList al=new ArrayList();
		while(temp.getnext()!=null) {
			System.out.print(temp.value+" ");
			temp=temp.next;
			
		}
		System.out.print(temp.value+" ");
	}
	
	public static void main(String[] args) {
			add(10);
			addtofront(20);
			addtofront(100);
			add(50); 
			printlist();
			
	}

}
