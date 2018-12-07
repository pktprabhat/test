package test;

public class first2 implements Runnable {
	Thread t;
	 first2(){
		t=new Thread(this,"new thread");
		t.start();
	}
	 public void run() {
		// TODO Auto-generated method stub
		 
	private void loop1() {
		// TODO Auto-generated method stub
		for(int i=10;i<20;++i) {
			System.out.println(i);
				Thread.sleep(500);
		 }
		}
	loop1();
	}
}