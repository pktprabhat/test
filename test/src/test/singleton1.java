package test;

public class singleton1{
	static int a;
	static int b;
	singleton1(float x){
		a=(int) (x/2);
		b=(int) (x/2);
	}
	public String toString() {
		return a+b+"";
	}
}