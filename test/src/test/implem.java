package test;
import java.util.*;
import java.lang.*;
import java.io.*;
class implem
 {
	static int checkprime(int n) {
		if(n<10) {
			return isprime(n);
		}
		return checkprime(n/10)*isprime(n%10);
	}
	public static void main (String[] args)
	 {
		int no=253;
		int i=isprime(no);
		int j=checkprime(no);
		if(i==1 && j==1)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	 }
	static int isprime(int n) {
		if(n==1)
	        return 0;
		if(n==2 || n==3)
			return 1;
		if(n%2==0)
			return 0;
		for(int i=3;i<=n/2;i=i+2) {
			if(n%i==0) {
				return 0;
			}
		}
		return 1;
	}
 }