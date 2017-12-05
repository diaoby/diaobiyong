package com.diaoby.thread03.ch04;

import java.io.PipedInputStream;

public class ThreadRead extends Thread{
	private ReadData readData;
	private PipedInputStream input;
	public ThreadRead(ReadData readData,PipedInputStream input) {
		super();
		this.readData = readData;
		this.input = input;
	}
	public void run() {
		readData.readMethod(input);
	}
	
}
