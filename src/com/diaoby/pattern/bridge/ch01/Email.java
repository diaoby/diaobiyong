package com.diaoby.pattern.bridge.ch01;

public class Email implements IMessage {

	@Override
	public void send(String user, String msg) {
		System.out.println("给"+user+"发送email信息："+msg);
	}

}
