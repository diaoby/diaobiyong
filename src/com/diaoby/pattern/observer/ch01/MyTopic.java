package com.diaoby.pattern.observer.ch01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyTopic implements Subject {
	private List<Observer> observers;
	private String msg;
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public MyTopic(){
		this.observers = new ArrayList();
	}

	@Override
	public void register(Observer observer) {
		if(null==observer) {
			throw new NullPointerException("Null Observer");
		}
		if(!observers.contains(observer)) {
			observers.add(observer);
		}
	}

	@Override
	public void unregister(Observer observer) {
		if(null==observer) {
			throw new NullPointerException("Null Observer");
		}
		if(observers.contains(observer)) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> it = observers.iterator();
		while(it.hasNext()) {
			Observer observer = it.next();
			observer.update(msg);
		}
	}

}
