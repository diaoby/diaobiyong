package com.diaoby.pattern.bridge.ch01;

public class WeixinExt implements IMessageExt {
	private String state;

	@Override
	public void send(String user, String msg) {
		System.out.println("给"+user+"发送"+state+"微信："+msg);
	}

	@Override
	public void getSendState(String state) {
		this.state = state;
	}

}
