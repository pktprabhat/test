package test;
import java.util.concurrent.*;

public class semDemo {
public static void main(String[] args) {
	Semaphore sem=new Semaphore(1);
	new IncThread(sem,"A");
	new DecThread(sem,"B");
}
}
