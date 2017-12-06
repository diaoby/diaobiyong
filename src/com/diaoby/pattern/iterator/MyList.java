package com.diaoby.pattern.iterator;

public class MyList implements List {
	
	private Object[] list;
	private int size = 0;
	private int index = 0;
	
	public MyList() {
		size = 0;
		index = 0;
		list = new Object[100];
	}

	@Override
	public void add(Object obj) {
		list[index++] = obj;
		size++;
	}

	@Override
	public Object get(int index) {
		return list[index];
	}

	@Override
	public Iterator iterator() {
		return new ConcreateIterator(this);
	}

	@Override
	public int getSize() {
		return size;
	}

}
