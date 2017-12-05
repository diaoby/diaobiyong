package com.diaoby.pattern.template;

public class DrivingTemplateClient {

	public static void main(String[] args) {
		DrivingTemplate didi = new Didi();
		didi.driving();
		DrivingTemplate uber = new Uber();
		uber.driving();
	}

}
