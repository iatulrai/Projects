package javaThreading;

import java.applet.Applet;

public class MyApplet  extends Applet {
	
	public void init() {
		
		MyClass oc = new MyClass();
		oc.start();
		
	}

}
