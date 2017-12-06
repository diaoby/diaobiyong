package com.diaoby.pattern.observer.ch01;
/**
 * 被观察者接口定义
 * @author Administrator
 *
 */
public interface Subject {
	public void register(Observer observer);
	public void unregister(Observer observer);
	public void notifyObservers();
}
