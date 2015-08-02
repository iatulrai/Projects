// The Bank Account Problem- here two people have a single bank account and they are going to withdraw money.

package javaThreading;

public class LockingTheThread implements Runnable{
	
	private BankAccount account = new BankAccount();
	
	public static void main(String[] args) {
		
		LockingTheThread bankAccount = new LockingTheThread();
		
		Thread one = new Thread(bankAccount);
		Thread two = new Thread(bankAccount);
		
		one.setName("People 1");
		two.setName("People 2");
		
		one.start();
		two.start();
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			makeWithdrwal(10);
			
			if(account.getBalance() < 0) {
				System.out.println("Overdrawn");
			}
			
		}
	}



	private synchronized void makeWithdrwal(int amount) {				// add synchronized keyword to make sure that second thread never enter until first thread completed.
	
		if(account.getBalance() >= amount) {
			
			System.out.println(Thread.currentThread().getName() + " is about to withdraw");
			try {
				
				System.out.println(Thread.currentThread().getName() + " is going to sleep");
				Thread.sleep(1000);
				
			} catch (InterruptedException ex){
				ex.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + " is wake up");
			
			account.withdraw(amount);
			
			System.out.println(Thread.currentThread().getName() + " completes the withdraw");
			
		} else {
			
			System.out.println("Not anough money for " + Thread.currentThread().getName() );
		}
	 }

}

/* 
class BankAccount {
	
	private int balance = 100;
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int amount) {
		
		balance = balance - amount;
		
	}
}
*/


