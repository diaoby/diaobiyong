package com.diaoby.pattern.bridge.ch02;

public class MessageClient {

	public static void main(String[] args) {
		String user="平哥";
		String msg="给您拜年";
		IMessage message = new Email();
		message.send(user, msg);
		message = new Weixin();
		message.send(user, msg);
		System.out.println("==============桥接模式==================");
//		AbstractMessage aMessage = new Ordinary();
		AbstractMessage aMessage = new Urgent();
		aMessage.message = new Email();
		aMessage.send(user, msg);
		aMessage.message = new Weixin();
		aMessage.send(user, msg);
	}

}
