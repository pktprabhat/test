package test;

import java.util.Scanner;

public class editdistance {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		String a=s.next();
		String b=s.next();
		int[][] mat=new int[n+1][m+1];
		for(int i=0;i<=n;i++) {
			for(int j = 0;j<=m;++j) {
				if(i==0) {
				//	System.out.println("h1");
					mat[i][j]=j;}
				else if(j==0){
				//	System.out.println("h2");
					mat[i][j]=i;}
				else if(a.charAt(i-1)==b.charAt(j-1)){
					//System.out.println("h3");
					mat[i][j]=mat[i-1][j-1];}
				else{
					//System.out.println("h4");
					mat[i][j]=Math.min(mat[i-1][j-1], Math.min(mat[i][j-1], mat[i-1][j]))+1;}
			}
		}
		System.out.println(mat[n][m]);
		for(int i=0;i<=n;i++) {
			for(int j = 0;j<=m;++j) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
		}
