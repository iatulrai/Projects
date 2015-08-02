package javaThreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyClient {
	
	public void go() {
        try {
        	
            Socket s = new Socket ("127.0.0.1", 9000);
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream()); 
            BufferedReader reader = new BufferedReader(streamReader);
            
            String advice = reader.readLine();
            System.out.println("Today you should: " + advice);
            reader.close();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args)
    {
        MyClient client = new MyClient();
        client.go();
    }
}