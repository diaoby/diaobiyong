package com.diaoby.thread03.ch02;

public class P{
	private MyStack myStack;
	public P(MyStack myStack) {
		super();
		this.myStack = myStack;
	}
	public void push(){
		myStack.push();
	}
}
