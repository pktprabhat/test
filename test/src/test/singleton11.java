package test;

class singleton11 {
	private static int count=0;
	static singleton11 s;
	private singleton11() {
		
		System.out.println("hello");
	}
	public static singleton11 make() {
		if(count<=0) {
			count++;
			s=new singleton11();
		return s;}
		return null;
	}
	void prin(){
		System.out.println("printing");
	}
}
