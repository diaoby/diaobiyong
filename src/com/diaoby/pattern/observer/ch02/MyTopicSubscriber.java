package com.diaoby.pattern.observer.ch02;

import java.util.Observable;
import java.util.Observer;
/**
 * JDK自带的观察者模式
 * @author Administrator
 *
 */
public class MyTopicSubscriber implements Observer {
	private String name;
	public MyTopicSubscriber(String name) {
		super();
		this.name = name;
	}
	@Override
	public void update(Observable o, Object arg) {
		MyTopic mytopic = (MyTopic) o;
		if(null==arg) {
			System.out.println(name+"=============="+mytopic.getMsg());
		}else {
			System.out.println(name+"=============="+mytopic.getMsg()+"arg:"+arg.toString());
		}
	}

}
