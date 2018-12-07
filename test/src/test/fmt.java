package test;

import java.util.Formatter;
import java.util.Scanner;

public class fmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner("1,2,3,4");
		s.useDelimiter(",");
		System.out.println(s.next()+" "+s.next()+" "+s.next()+" "+s.next()+" "+s.hasNext());

	}

}
