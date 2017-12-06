package com.diaoby.pattern.iterator;


public class ConcreateIterator implements Iterator {
	private List list = null;
	private int index;
	
	public ConcreateIterator(List list) {
		super();
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		if(index>=list.getSize()) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public Object next() {
		Object object = list.get(index);
		index++;
		return object;
	}

}
