package com.diaoby.pattern.chain;

public class BOSS extends LeaveHandler {

	@Override
	public void disposeLeave(int day) {
		if(day<=5) {
			System.out.println("请假"+day+"天，我HR批准了");
		}else {
			successor.disposeLeave(day);
		}
	}

}
