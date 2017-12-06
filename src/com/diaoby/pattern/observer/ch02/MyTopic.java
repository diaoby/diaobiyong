package com.diaoby.pattern.observer.ch02;

import java.util.Observable;
/**
 *  被观察者
 * @author Administrator
 *
 */
public class MyTopic extends Observable {
	private String msg;
	public void setMsg(String msg) {
		this.msg = msg;
		super.setChanged();
	}
	public String getMsg() {
		return msg;
	}
}
