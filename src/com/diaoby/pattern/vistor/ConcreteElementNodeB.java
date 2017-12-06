package com.diaoby.pattern.vistor;

public class ConcreteElementNodeB implements ElementNode {

	@Override
	public void accept(Vistor vistor) {
		vistor.visist(this);
	}
	
	public String operationB() {
		return "ConcreteElementNodeB";
	}

}
