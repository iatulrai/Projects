package javaThreading;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	
	String[] adviceList = {"Study", "Running", "Climbing", "Eating", "Fishing", "Biking", "Playing"};
	
	public void go() {
		
		try {
			
			ServerSocket serverSock = new ServerSocket(9000);
			
			while (true) {
				
				Socket sock = serverSock.accept();
				
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
				
			}
			
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private String getAdvice() {
		
		int ramdon = (int) (Math.random() * adviceList.length);
		return adviceList[ramdon];
	}
	
	public static void main(String[] args) {
		MyServer server = new MyServer();
		server.go();
	}

}
