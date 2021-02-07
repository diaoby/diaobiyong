package com.diaoby.thread02.ch06;

import com.diaoby.thread02.ch06.PublicClass.PrivateClass;

public class Run {

	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		publicClass.setUserName("diaoby");
		publicClass.setPassword("diaoby001");
		System.out.println("publicClass.setUserName "+publicClass.getUserName()+
					" "+"publicClass.setPassword " +publicClass.getPassword());
		PrivateClass privateClass = new PrivateClass();
		privateClass.setAge("12");
		privateClass.setAddress("杭州市");
		System.out.println("privateClass.getAge "+privateClass.getAge()+
				" "+"privateClass.getAddress " +privateClass.getAddress());
		privateClass.printPublicProperty();
		
	}

}
