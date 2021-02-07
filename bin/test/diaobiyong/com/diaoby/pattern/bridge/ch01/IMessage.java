package com.diaoby.pattern.bridge.ch01;
/**
 * 发送消息报告
 * @author Administrator
 *
 */
public interface IMessage {
	void send(String user,String msg);
}
