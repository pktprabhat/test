package test;
//left rotation
import java.util.ArrayList;
import java.util.Scanner;

public class mindfire2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int d=s.nextInt();
		int a1=-1;
		int a2=-1;
		int[] arr2=new int[n];
		int[] arr=new int[n];
		for(int i=0;i<n;++i) {
			if(i<d) {
				arr2[++a2]=s.nextInt();
			}
			else {
			arr[++a1]=s.nextInt();
			}
		}
		for(int i=0;i<=a2;++i) {
			arr[++a1]=arr2[i];
		}
		for(int i=0;i<n;++i) {
			System.out.println(arr[i]);
		}
		}
}
