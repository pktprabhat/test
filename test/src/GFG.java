import java.util.Scanner;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //code
		 Scanner s=new Scanner(System.in);
		 int t=s.nextInt();
		 while(t-->0){
		 int x=s.ne		int y=length(x);
		int z=check(x,y);
		System.out.println(x+" "+z+" "+y);
		if(x==z)
			System.out.println("yes");
		else
			System.out.println("no");
		System.out.println(Math.abs(-10));
		 }	
	}
	 public static int length(int x) {
	if(x<10)
		return 1;
	 return length(x/10) +1;
	 }
	 
	 public static int check(int x,int j) {
		 if(x<10) {
			 return (int) Math.pow(x, j) ;
			 }
		 return (int) (Math.pow(x%10, j) +check(x/10,j));
		 
	 }

}
