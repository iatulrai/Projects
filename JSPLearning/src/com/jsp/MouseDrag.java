package com.jsp;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseDrag extends Applet implements MouseMotionListener {

	public void init() {
		addMouseMotionListener(this);
		setBackground(Color.red);
	}

	public void mouseDragged(MouseEvent me) {
		Graphics g = getGraphics();
		g.setColor(Color.black);
		g.fillOval(me.getX(), me.getY(), 20, 20);
	}

	public void mouseMoved(MouseEvent me) {
	}

}
