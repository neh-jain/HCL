
public class RunnableEx implements Runnable{
	public void run()
	{
		System.out.println("Thread is running for runnable implementation");
	}

	public static void main(String[] args) {
		RunnableEx r = new RunnableEx();
		Thread t = new Thread(r);
		t.start();

	}

}
