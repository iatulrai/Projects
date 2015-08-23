package javaThreading;

public class TenThread {

	private static class WorkerThread extends Thread {

		int max = Integer.MIN_VALUE;
		int[] ourArray;

		public WorkerThread(int[] ourArray) {
			this.ourArray = ourArray;
		}

		public void run() {
			for (int i = 0; i < ourArray.length; i++) {
				
				max = Math.max(max, ourArray[i]);

			}
			
			/*private int getMax() {
				return max;
			} */
		}

		public static void main(String[] args) {
			
			WorkerThread[] threads = new WorkerThread[10];
			int[][] bigMatrix = getBigHairyMatrix();
			int max = Integer.MIN_VALUE;
			
			for(int i = 0; i < 10; i++){
				threads[i] = new WorkerThread(bigMatrix[i]);
				threads[i].start();
			}
			
			try{
				for(int i = 0; i < 10; i++){
					
					threads[i].join();
					
					max = Math.max(max, threads[i].getMax());
				}
			} catch (InterruptedException ex){
				ex.printStackTrace();
			}
			
			System.out.println("maximum value was: " +max);
		}

		private int getMax() {
			// TODO Auto-generated method stub
			return max;
		}

		private static int[][] getBigHairyMatrix() {
			// TODO Auto-generated method stub
			return null;
		}
	}

}
