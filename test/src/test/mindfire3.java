package test;

import java.util.StringTokenizer;

public class mindfire3 {

	public static void main(String[] args) {
		String s="i love hello world";
		StringTokenizer st=new StringTokenizer(s);
		StringBuffer sb=new StringBuffer();
		while(st.hasMoreTokens()) {
			sb.insert(0, rev(st.nextToken())+" ");
		}
		System.out.println(sb);
	}

	private static String rev(String nextToken) {
		// TODO Auto-generated method stub
		if(nextToken.length()<2)
			return nextToken;
		return rev(nextToken.substring(1, nextToken.length()))+ nextToken.charAt(0);
	}


}
