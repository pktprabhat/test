package test;

import java.util.Scanner;

public class recurs {
	static int sum;
	static int n;
	static int[] arr;
	static int[] arr2;
	static int k;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		sum=s.nextInt();
		n=s.nextInt();
		arr=new int[n];
		for(int i=0;i<n;++i) {
			arr[i]=s.nextInt();
		}
		k=s.nextInt();
		arr2=new int[k+1];
		System.out.println(fn(0,0));
		for(int i=0;i<arr2.length-1;++i) {
			System.out.print("  "+arr2[i]);
		}
	}
	static boolean fn(int count,int counter) {
		if(count>=k-1 && counter<n) {
			//System.out.println("fn 1 1            "+count+"       "+counter);
			for(int i=counter;i<n;++i) {
				arr2[count]=arr[i];
			//	System.out.println("fn 1 2            "+count+"       "+i);
				if(add(arr2)==sum) return true;
			}
		}
		else if(counter<n-1){
			for(int i=counter;i<n-1;++i) {
			//	System.out.println("fn 2 1            "+count+"       "+counter);
				arr2[count]=arr[i];
			//	System.out.println("arr2   "+count+"        "+arr2[count]);
				if(fn(count+1,i+1)) 
					return true;
			}
		}
		return false;
	}
	private static int add(int[] arr22) {
		int temp=0;
		for(int i=0;i<arr22.length;++i) {
			temp+=arr22[i];
		}
		return temp;
	}
}
