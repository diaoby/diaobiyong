package com.diaoby.pattern.observer.ch01;

public class MyTopicSubscriber implements Observer {
	private String name;
	public MyTopicSubscriber(String name) {
		super();
		this.name = name;
	}
	@Override
	public void update(String msg) {
		System.out.println(name+"=============="+msg);
		
	}
}
