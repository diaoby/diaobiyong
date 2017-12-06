package com.diaoby.pattern.chain;

public class LeaveHandlerClient {

	public static void main(String[] args) {
		LeaveHandler leaveHandler =LeaveHandlerFactory.createLeaveHadler();
		leaveHandler.disposeLeave(1);
	}

}
