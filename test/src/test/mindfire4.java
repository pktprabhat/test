package test;

import java.util.ArrayList;
import java.util.Arrays;

public class mindfire4 {
	public static void main(String[] args) {
		int a=111;
		int b=25;
		while(a!=b) {
			if(a>b)
				a-=b;
			else
				b-=a;
		}
		System.out.println(a);
	}
}
