package p1_ThreadCreation;

public class MyRunnableThread {
	
	public static int Count = 0;
	public MyRunnableThread() {
		
	}
	
	public void run() {
        while(MyRunnableThread.Count <= 10){
            try{
                System.out.println("Expl Thread: "+(++MyRunnableThread.Count));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting Main Thread...");
        MyRunnableThread mrt = new MyRunnableThread();
        Thread t = new Thread();
        t.start();
        while(MyRunnableThread.Count <= 10){
            try{
                System.out.println("Main Thread: "+(++MyRunnableThread.Count));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");


	}

}
