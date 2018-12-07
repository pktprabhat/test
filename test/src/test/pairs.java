package test;

import java.util.Arrays;
import java.util.Scanner;

public class pairs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;++i) {
			arr[i]=s.nextInt();
		}
		int count=0;
		for(int i=0;i<n;++i) {
			for(int j=0;j<n;++j) {
				if(i==j) continue;
				if(arr[i]+arr[j]==k) count++;
			}
		}
		System.out.println(count);
	}
}