package test;

import java.util.*;

public class diamond {
	static int mat1[][];
	static int mat2[][];
	static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		mat1=new int[n][n];
		for(int i=0;i<n;++i)
			for(int j=0;j<n;++j)
				mat1[i][j]=s.nextInt();
		
		mat2=new int[n][n];
		ispath(0,0,0);
		System.out.println(mat2[n-1][n-1]==0?"-1":mat2[n-1][n-1]);
		/*for(int i=0;i<n;++i)
			for(int j=0;j<n;++j)
				System.out.println(mat2[i][j]);*/
	}
	static void ispath(int i, int j,int count) {
		if(i<0 || j<0 || i>=n || j>=n)
			return;
		if(mat1[i][j]==-1)
		return;
		if(mat2[i][j]>count) 
		return;
		int temp=0;
		if(mat1[i][j]==1) 
			temp=1;
		mat2[i][j]=count+temp;
		ispath(i,j+1,count+temp);
		ispath(i+1,j,count+temp);	
	}
}