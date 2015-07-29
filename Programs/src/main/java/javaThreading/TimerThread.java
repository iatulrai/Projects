package javaThreading;

import java.awt.Component;

public class TimerThread extends Thread {
	
	Component comp;
	int timediff;
	volatile boolean shouldRun;
	
	public TimerThread(Component comp, int timediff) {
		
		this.comp = comp;
		this.timediff = timediff;
		shouldRun = true;		
	}
	
	public void run() {
		
		while(shouldRun) {
			
			try {
				
				comp.repaint();
				sleep(timediff);
				
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
