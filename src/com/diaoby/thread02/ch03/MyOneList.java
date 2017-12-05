package com.diaoby.thread02.ch03;

import java.util.ArrayList;
import java.util.List;

public class MyOneList {
	private List list = new ArrayList();
	public synchronized void add(String data) {
		list.add(data);
	}
	
	public synchronized int getSize() {
		return list.size();
	}
	
}
