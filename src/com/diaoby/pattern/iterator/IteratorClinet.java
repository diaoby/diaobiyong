package com.diaoby.pattern.iterator;

public class IteratorClinet {

	public static void main(String[] args) {
		List list = new MyList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj.toString());
		}
	}

}
