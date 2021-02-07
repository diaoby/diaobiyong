package com.diaoby.thread01.ch03;

public class ALogin extends Thread {
	public void run() {
		LoginServlet.doPost("a", "aa");
	}
}
