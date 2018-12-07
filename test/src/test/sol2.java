package test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class sol2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		StringTokenizer strtok=new StringTokenizer(st);
		StringBuffer sb=new StringBuffer();
		while(strtok.hasMoreTokens()) {
			sb.append(rev(strtok.nextToken())+" ");
		}
		System.out.println(sb);
	}

	static String rev(String nextToken) {
		// TODO Auto-generated method stub
		if(nextToken.length()==1) {
			return nextToken;
		}
		return rev(nextToken.substring(1, nextToken.length()))+nextToken.charAt(0);
	}

}
