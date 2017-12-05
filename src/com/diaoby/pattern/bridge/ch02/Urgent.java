package com.diaoby.pattern.bridge.ch02;

public class Urgent extends AbstractMessage {
	public void send(String user,String msg) {
		msg ="加急消息："+msg;
		message.send(user, msg);
	}
}
