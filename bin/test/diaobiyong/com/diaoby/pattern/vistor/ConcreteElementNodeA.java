package com.diaoby.pattern.vistor;

public class ConcreteElementNodeA implements ElementNode {

	@Override
	public void accept(Vistor vistor) {
		vistor.visist(this);
	}
	
	public String operationA() {
		return "ConcreteElementNodeA";
	}

}
