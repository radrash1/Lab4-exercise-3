package Client;

import java.io.*;
import java.net.*;

public class WordCounterClient {

	public static void main(String [] args) throws UnknownHostException, IOException
	{
		ClientFrame test = new ClientFrame();
		test.setVisible(true);
		
		Socket s = new Socket("localhost", 9999);
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		DataInputStream din = new DataInputStream(s.getInputStream());
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			//String so = br.readLine();
			if(test.getButton()) {
			String so = test.getText();
			dout.writeUTF(so);
			String yoo = din.readUTF();
			test.setText(yoo);
	
			test.setButton();
			}
		}
	
		
	}
}
