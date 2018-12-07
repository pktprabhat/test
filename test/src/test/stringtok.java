package test;


import java.util.*;
import java.lang.*;
import java.io.*;

public class stringtok {
	static int[][] arr;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    String input=s.nextLine();
	    int m = 0;
	    for(int i=0;i<input.length();++i) {
	    	if(input.charAt(i)=='#') break;
	    	if(input.charAt(i)=='@') m++;
	    }
	    int n = 0;
	    for(int i=0;i<input.length();++i) {
	    	if(input.charAt(i)=='#') n++;
	    }
	    arr=new int[n+1][m+1];
	    StringTokenizer st=new StringTokenizer(input,"@#",true);
	    int i=0,j=0;
	    while(st.hasMoreTokens()) {
	    	String tt=st.nextToken();
	    	if(tt.equals("#")) { i++; j=0; }
	    	else if(tt.equals("@")) j++;
	    	else {
	    		arr[i][j]=Integer.parseInt(tt);
	    	}
	    }
	    int min=Integer.MAX_VALUE;
	    for(i=0;i<=n;++i) {
	    	for(j=0;j<=m;++j) {
	    		if(arr[i][j]==-1) continue;
	    		else if(arr[i][j]<min)
	    			min=arr[i][j];
	    	}
	    }
	    System.out.println(min);
	    
	    
	    /*
	    for(i=0;i<=n;++i) {
	    	for(j=0;j<=m;++j) {
	    		System.out.print(arr[i][j]+"\t");
	    	}
	    	System.out.println();
	    }*/
	}
}