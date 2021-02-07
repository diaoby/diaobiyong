package com.diaoby.pattern.observer.ch02;

import java.util.Observer;

import com.diaoby.pattern.observer.ch02.MyTopicSubscriber;
/**
 * jdk
 *  观察者实现
 * @author Administrator
 *
 */
public class ObserverClient {

	public static void main(String[] args) {
		MyTopic myTopic = new MyTopic();
		Observer obj1 = new MyTopicSubscriber("张三");
		Observer obj2 = new MyTopicSubscriber("李四");
		Observer obj3 = new MyTopicSubscriber("王五");
		//注册
		myTopic.addObserver(obj1);
		myTopic.addObserver(obj2);
		myTopic.addObserver(obj3);
		myTopic.setMsg("还老子钱");
		myTopic.notifyObservers();
		myTopic.deleteObserver(obj3);
		myTopic.setMsg("给你们5天时间，还老子钱");
		myTopic.notifyObservers();
		int size = myTopic.countObservers();
		System.out.println("观察者还有"+size);
		myTopic.deleteObserver(obj1);
		myTopic.setMsg("李四,在不还钱我要砍死你");
		myTopic.notifyObservers(new String("你给老子记住了"));
	}

}
