package test;

public class allancestor {
	static boolean allan(Node root,int n) {
		 
		         /* base cases */
		        if (root == null) 
		            return false; 
		   
		        if (root.data == n) 
		            return true; 
		   
		        /* If n is present in either left or right subtree  
		           of this root, then print this root */
		        if (allan(root.left, n) 
		                || allan(root.right, n))  
		        { 
		            System.out.print(root.data + " "); 
		            return true; 
		        } 
		   
		        /* Else return false */
		        return false; 
		    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = null; 
        root = new Node(1); 
        root.left = new Node(2); 
       root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        int path[]=new int[10];
        allan(root,7); 
       // System.out.println(root.right.data);

	}

}
