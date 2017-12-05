package com.diaoby.pattern.bridge.ch02;

public class Ordinary extends AbstractMessage {
	public void send(String user,String msg) {
		msg ="普通消息："+msg;
		message.send(user, msg);
	}
}
