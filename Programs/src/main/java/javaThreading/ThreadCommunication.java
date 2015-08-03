package javaThreading;

public class ThreadCommunication extends Thread {
	public static void main(String[] args) {

		ThreadCommunication t1 = new ThreadCommunication();
		ThreadCommunication t2 = new ThreadCommunication();
		ThreadCommunication t3 = new ThreadCommunication();

		t1.setName("A thread");
		t2.setName("B thread");
		t3.setName("C thread");

		t1.start();
		t2.start();
		t3.start();
	}

	public void run() {

		boolean conditionFlag = true;

		while (!conditionFlag) {
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			
			System.out.println("Communicated");

		}

	}

}
