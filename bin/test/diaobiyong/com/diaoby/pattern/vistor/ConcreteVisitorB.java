package com.diaoby.pattern.vistor;

public class ConcreteVisitorB implements Vistor {

	@Override
	public void visist(ConcreteElementNodeA node) {
		System.out.println(node.operationA());
	}

	@Override
	public void visist(ConcreteElementNodeB node) {
		System.out.println(node.operationB());
	}

}
