package com.client;

import java.io.DataOutputStream;
import java.net.Socket;



public class SimpleTCPClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
//			Socket connectionSocket = new Socket("10.25.231.246",6789);
			Socket connectionSocket = new Socket("192.168.1.3", 6789);
			DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
//			String bluetooth = "7C:6D:62:A3:86:6F";
//			String bluetooth = "B8:F6:B1:11:1A:64";
			String bluetooth = "60:FB:42:88:2D:9E";
			String msg = bluetooth+"_daniel_inside";
			outToClient.writeBytes(msg);
			Thread.sleep(10000);
			msg = bluetooth+"_daniel_outside";
			outToClient.writeBytes(msg);
			outToClient.close();
			connectionSocket.close();
		}catch(Exception e){

		}
	}
}
