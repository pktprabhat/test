package test;
//sub array
import java.util.Scanner;

public class mindfire1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,5,2,4,3,7,10,6,5};
		int fsum=22;
		int pos1=-1,pos2=-1;
		boolean is=false;
		for(int i=0;i<a.length;++i) {
			int sum=0;
			for(int j=i;j<a.length;++j) {
				sum+=a[j];
				if(sum==fsum) {
					pos1=i;
					pos2=j;
					is=true;
					break;
				}
				if(is) break;
			}
			if(is) break;
		}
		System.out.println("finded subarray is:");
		if(pos1==-1)
			System.out.println("no subarray");
		else
		for(int i=pos1;i<=pos2;++i)
			System.out.print(a[i]+" ");
		
	}

}
