package javaThreading;

import java.applet.Applet;

public class OurApplet extends Applet {
	
	private static final long serialVersionUID = 1L;

	public void init() {
		
		OurClass oc = new OurClass();
		oc.start();
		
	}

}
