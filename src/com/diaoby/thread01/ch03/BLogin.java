package com.diaoby.thread01.ch03;

public class BLogin extends Thread {
	public void run() {
		LoginServlet.doPost("b", "bb");
	}
}
