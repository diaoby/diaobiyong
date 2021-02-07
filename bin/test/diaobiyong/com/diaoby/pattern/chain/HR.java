package com.diaoby.pattern.chain;

public class HR extends LeaveHandler {

	@Override
	public void disposeLeave(int day) {
		if(day<=3) {
			System.out.println("请假"+day+"天，我CTO批准了");
		}else {
			successor.disposeLeave(day);
		}
	}

}
