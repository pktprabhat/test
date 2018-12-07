package test;

import java.util.Scanner;

public class Aclassb {
	public static int mtu(int arr[][],int i,int j) {
		if(i<0 || j<0) return 0;
		if(arr[i][j]==-1) return 0;
		if(arr[i][j]==2) return 1;
		return (mtu( arr, --i , j)+mtl( arr, i , --j)+mtr( arr, i , ++j));
	}
	public static int mtd(int arr[][],int i,int j) {
		if(i<0 || j<0) return 0;
		if(arr[i][j]==-1) return 0;
		if(arr[i][j]==2) return 1;
		return (mtd(arr, ++i , j)+mtl( arr, i , --j)+mtr( arr, i , ++j));
	}
	public static int mtl(int arr[][],int i,int j) {
		if(i<0 || j<0) return 0;
		if(arr[i][j]==-1) return 0;
		if(arr[i][j]==2) return 1;
		return (mtu(arr, --i , j)+mtd( arr, ++i , j)+mtl( arr, i , --j));
	}
	public static int mtr(int arr[][],int i,int j) {
		if(i<0 || j<0) return 0;
		if(arr[i][j]==-1) return 0;
		if(arr[i][j]==2) return 1;
		return (mtu(arr, --i , j)+mtd(arr, ++i , j)+mtr( arr, i ,++j));
	}


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in); 
		int[][] arr=new int[5][5];
		for(int i=0;i<5;++i)
			for(int j=0;j<5;++j)
				arr[i][j]=s.nextInt();

		int a = mtu(arr,0,0);
		int b= mtd(arr,0,0);
		int c = mtl(arr,0,0);
		int d= mtr(arr,0,0);
		if(a==1 ||b==1||c==1||d==1)
	System.out.println("yes");
		else
			System.out.println("no");
	
	 }
	}
