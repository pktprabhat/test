package test;


import java.util.*;
import java.lang.*;
import java.io.*;

public class singleton {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc>0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int[] a1=new int[n];
		    for(int i=0;i<n;i++)a1[i]=sc.nextInt();
		    boolean[][] dp=new boolean[n+2][k+2];
		    for(int i=0;i<=n;i++)dp[i][0]=true;
		    for(int j=1;j<=k;j++)dp[0][j]=false;
		    for(int i=1;i<=n;i++){
		        for(int j=1;j<=k;j++){
		            dp[i][j]=dp[i-1][j];
		            if(j>=a1[i-1])
		            dp[i][j]=dp[i][j]||dp[i][j-a1[i-1]]; 
		        }
		    }
		    if(dp[n][k]==true)System.out.println("1");
		    else System.out.println("0");
		    tc--;
		}
	}
}