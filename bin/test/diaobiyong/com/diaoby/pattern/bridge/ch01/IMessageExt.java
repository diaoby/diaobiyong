package com.diaoby.pattern.bridge.ch01;
/**
 * 消息扩展后，需要加入第二种维度--紧急程度
 * @author Administrator
 *
 */
public interface IMessageExt extends IMessage {
	void getSendState(String state); 
}
