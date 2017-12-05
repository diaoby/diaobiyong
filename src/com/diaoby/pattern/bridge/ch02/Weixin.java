package com.diaoby.pattern.bridge.ch02;

public class Weixin implements IMessage {

	@Override
	public void send(String user, String msg) {
		System.out.println("给"+user+"发送微信："+msg);
	}

}
