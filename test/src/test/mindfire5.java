package test;

public class mindfire5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="strings";
		int l1=0,l2=0;
		StringBuffer sb=new StringBuffer();
		while(l1<s1.length() || l2<s2.length()) {
			if(l1<s1.length()) {
				sb.append(s1.charAt(l1));
				l1++;
			}
			if(l2<s2.length()) {
				sb.append(s2.charAt(l2));
				l2++;
			}
		}
		System.out.println(sb);
	}

}
