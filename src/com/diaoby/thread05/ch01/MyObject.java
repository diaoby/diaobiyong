package com.diaoby.thread05.ch01;

import java.io.Serializable;

public class MyObject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 888L;
	
	private static class MyObjectHandler{
		private static final MyObject myObject = new MyObject();
	}
	public static MyObject getInstance() {
		return MyObjectHandler.myObject;
	}
	protected Object readResolve() {
		System.out.println("调用了readResolve 方法");
		return MyObjectHandler.myObject;
	}

}
