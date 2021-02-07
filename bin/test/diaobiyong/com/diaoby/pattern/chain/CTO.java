package com.diaoby.pattern.chain;

public class CTO extends LeaveHandler {

	@Override
	public void disposeLeave(int day) {
		System.out.println("请假"+day+"天，我BOSS批准了");
	}

}
