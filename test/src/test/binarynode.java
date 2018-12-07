package test;

public class binarynode {
	
	int value;
	binarynode left=null;
	binarynode right=null;

	public binarynode(int n) {
		// TODO Auto-generated constructor stub
		this.value=n;
	}
	
	public int get() {
		return this.value;
	}
	
	public binarynode getleft() {
		return this.left;
	}
	
	public binarynode getright() {
		return this.right;
	}

}
