package test;
import java.util.*;

public class testaa {
	public static void main(String[] args) {
		singleton11 a=singleton11.make();
		singleton11 b=singleton11.make();
		System.out.println(a+" "+b);
		a.prin();
	}
}