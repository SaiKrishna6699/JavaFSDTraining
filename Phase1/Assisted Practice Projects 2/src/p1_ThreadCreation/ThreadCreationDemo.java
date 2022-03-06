package p1_ThreadCreation;

public class ThreadCreationDemo {
	
	public void run() {
		System.out.println("Concurrent Thread Running.");
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		ThreadCreationDemo th = new ThreadCreationDemo();
		th.run();

	}


}