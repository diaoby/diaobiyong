package com.diaoby.pattern.observer.ch01;

public class ObserverClient {

	public static void main(String[] args) {
		//被观察者
		MyTopic subject = new MyTopic();
		subject.setMsg("还老子钱");
		//观察者
		Observer obj1 = new MyTopicSubscriber("张三");
		Observer obj2 = new MyTopicSubscriber("李四");
		Observer obj3 = new MyTopicSubscriber("王五");
		//全部注册
		subject.register(obj1);
		subject.register(obj2);
		subject.register(obj3);
		//通知他们
		subject.notifyObservers();
		//移除obj3
		subject.unregister(obj3);
		subject.setMsg("给你们5天时间，还老子钱");
		subject.notifyObservers();
	}

}
