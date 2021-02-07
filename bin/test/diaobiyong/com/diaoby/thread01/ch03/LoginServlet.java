package com.diaoby.thread01.ch03;

public class LoginServlet {
	private static String _urserName;
	private static String _password;
	public  static void doPost(String userName,String password) {
		try {
			_urserName = userName;
			if(userName.equals("a")) {
				Thread.sleep(500);
			} 
			_password = password;
			System.out.println("========userName====="+_urserName+"====password=="+_password);
		}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
}
