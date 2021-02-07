package com.diaoby.pattern.bridge.ch01;

public class MessageClient {

	public static void main(String[] args) {
		String user="平哥";
		String msg="给您拜年";
		IMessage message = new Email();
		message.send(user, msg);
		message = new Weixin();
		message.send(user, msg);
		//短消息开始增加紧急程度---需要扩展很多子类，不停去继承
		IMessageExt messageExt = new EmailExt();
		messageExt.getSendState("紧急");
		messageExt.send(user, msg);
		messageExt = new WeixinExt();
		messageExt.getSendState("普通");
		messageExt.send(user, msg);
	}

}
