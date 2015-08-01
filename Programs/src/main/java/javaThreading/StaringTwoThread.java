// staring the two thread and analyze the result

package javaThreading;

public class StaringTwoThread implements Runnable{
	public static void main(String[] args) {
		
		StaringTwoThread twoThread = new StaringTwoThread();
		
		Thread first = new Thread(twoThread);
		Thread second = new Thread(twoThread);
		
		first.setName("first Thread");
		second.setName("Second Thread");
		
		first.start();
		second.start();
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 15; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is running");
		}
		
	}

}
