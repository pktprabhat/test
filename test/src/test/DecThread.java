package test;

import java.util.concurrent.Semaphore;

public class DecThread implements Runnable {
	String name;
	Semaphore sem;
	public DecThread(Semaphore s, String n) {
		// TODO Auto-generated constructor stub
			sem=s;
			name=n;
			new Thread(this).start();
			// TODO Auto-generated constructor stub
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("starting "+name);
			try {
				
				for(int i=0;i<5;++i) {
					System.out.println(name+" is waiting for permit");
					sem.acquire();
					System.out.println(name+" get a permit");
					Shared.count--;
					System.out.println(name+" "+Shared.count);
					System.out.println(name+" will not release permit");
					
					Thread.sleep(10);
				}
			}catch(Exception e) {
				System.out.print("exception");
			}
			
		}
	

}
