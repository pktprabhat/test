package test;

public class allpaths {
	static int zee=10;
	static void printpath(Node root,int[] path,int len) {
		if(root==null) return;
		path[len++]=root.data;
		//System.out.println("here 1@");
		if(root.left==null && root.right==null) {
			//System.out.println("here 2@");
			prin(path,len);
		}
		else {
			if(root.left!=null) {//System.out.println("here 3@");
				printpath(root.left,path,len);}
			if(root.right!=null) {//System.out.println("here 4@");
				printpath(root.right,path,len);}
		}
		//System.out.println("here 5@");
	}
	
	static void prin(int[] path, int len) {
	//	System.out.println("prin");
		for(int i=0;i<len;++i)
			System.out.print(path[i]+" ");
		System.out.println();
		
	}

	public static void main(String[] args) {
			Node root = null; 
	        root = new Node(1); 
	        root.left = new Node(2); 
	       root.right = new Node(3); 
	        root.left.left = new Node(4); 
	        root.left.right = new Node(5); 
	        root.right.left = new Node(6); 
	        root.right.right = new Node(7); 
	        int path[]=new int[10];
	        printpath(root,path,0); 
	       // System.out.println("end");
	}

}
