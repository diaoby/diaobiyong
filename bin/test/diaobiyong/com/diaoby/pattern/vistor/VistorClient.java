package com.diaoby.pattern.vistor;

public class VistorClient {

	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.add(new ConcreteElementNodeA());
		objectStructure.add(new ConcreteElementNodeB());
		Vistor vistor = new ConcreteVisitorA();
		objectStructure.action(vistor);
		vistor =  new ConcreteVisitorB();
		objectStructure.action(vistor);
	}

}
