
public class ThreadEx extends Thread{
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		ThreadEx t1 = new ThreadEx();
		t1.start();

	}

}
