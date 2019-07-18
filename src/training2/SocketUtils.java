package training2;

import java.io.*;
import java.net.Socket;

public class SocketUtils {

	public void writeToDataOutputStream(DataOutputStream dos  , String message) throws IOException {
		dos.writeUTF(message);
		dos.flush();
	}
	public void writeToSocket(Socket s , String message) throws IOException {
		writeToOutputStream(s.getOutputStream() , message);
	}
	private void writeToOutputStream(OutputStream os, String message) throws IOException {
		// TODO Auto-generated method stub
		writeToDataOutputStream(new DataOutputStream(os) , message);
	}

	
}
