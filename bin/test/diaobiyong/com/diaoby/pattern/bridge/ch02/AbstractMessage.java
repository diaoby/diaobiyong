package com.diaoby.pattern.bridge.ch02;
/**
 * 桥接模式
 * @author Administrator
 *
 */
public class AbstractMessage {
	public IMessage message;
	public void send(String user,String msg) {
		message.send(user, msg);
	}
}
