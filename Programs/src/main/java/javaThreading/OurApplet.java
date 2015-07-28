package javaThreading;

import java.applet.Applet;

public class OurApplet extends Applet {
	
	public void init() {
		
		OurClass oc = new OurClass();
		oc.run();
		
	}

}
