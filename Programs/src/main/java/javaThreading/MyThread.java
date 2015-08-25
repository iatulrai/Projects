package javaThreading;

public class MyThread extends Thread {
	
	public void run() {
		
		System.out.println("shutdown hook task completed");

	}
	
	public static  class Shutdown{
		public static void main(String[] args) throws Exception{
			Runtime r = Runtime.getRuntime();
			r.addShutdownHook(new MyThread());
			
			System.out.println("Now sleeping.... press ctrl+c to exit");
			try{
				Thread.sleep(2000);
			} catch (InterruptedException ex){
				ex.printStackTrace();
			}
			
		}
	}

}
