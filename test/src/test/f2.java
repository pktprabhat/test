package test;

public class f2 extends Thread {
	static int aa=10;
	f2(){
		super("thread2");
		this.start();
	}
	public void run() {
		try {
			for(int i=0;i<100;++i)
				clme(i);
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void clme(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}
}
