package com.diaoby.thread03.ch03;

public class C {
	private MyStack myStack;
	public C(MyStack myStack) {
		super();
		this.myStack = myStack;
	}
	public void pop(){
		myStack.pop();
	}
}
