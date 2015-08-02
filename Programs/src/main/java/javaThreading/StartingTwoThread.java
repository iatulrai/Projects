// staring the two thread and analyze the result

package javaThreading;

public class StartingTwoThread implements Runnable{
	public static void main(String[] args) {
		
		StartingTwoThread twoThread = new StartingTwoThread();
		
		Thread first = new Thread(twoThread);
		Thread second = new Thread(twoThread);
		
		first.setName("First Thread");
		second.setName("Second Thread");
		
		first.start();
		second.start();
        	
	}

	@Override
	public void run() {
		
		
		for (int i = 0; i < 30; i++) {
			
			String name = Thread.currentThread().getName();
			System.out.println(name + " is running");
		}
		
	}

}
