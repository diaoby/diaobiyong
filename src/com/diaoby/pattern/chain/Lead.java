package com.diaoby.pattern.chain;

public class Lead extends LeaveHandler {

	@Override
	public void disposeLeave(int day) {
		if(day<=1) {
			System.out.println("请假"+day+"天，我经理批准了");
		}else {
			successor.disposeLeave(day);
		}
	}

}
