package test;

import java.util.Arrays;
import java.util.Scanner;

public class freshworks {
	static int[] arr;
	static int n;
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 n=s.nextInt();
		    arr=new int[n];
		    for(int i=0;i<n;++i){
		        arr[i]=s.nextInt();
		    }
		    Arrays.sort(arr);
		    int s1=0,s2=0;
		    int i=0,j=n-1;
		    System.out.println(calc(0,s1,s2));
	}
	
	private static int calc(int i, int s1, int s2) {
		if(i>=n){ //System.out.println("no");
			return Math.abs(s1-s2);}
		//System.out.println(i);
		return Math.min(calc(i+1,s1+arr[i],s2), calc(i+1,s1,s2+arr[i]));
	}






















	static boolean isprime(int n){
        if(n<2) return false;
        if(n==2 || n==3) return true;
        if(n%2==0) return false;
        for(int i=3;i<Math.sqrt(n);i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}