package com.diaoby.thread03.ch02;

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
