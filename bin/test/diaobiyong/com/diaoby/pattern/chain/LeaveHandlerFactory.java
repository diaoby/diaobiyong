package com.diaoby.pattern.chain;

public class LeaveHandlerFactory {
	
	public static LeaveHandler createLeaveHadler() {
		LeaveHandler lead = new Lead();
		LeaveHandler cto = new CTO();
		LeaveHandler hr = new HR();
		LeaveHandler boss = new BOSS();
		lead.setSuccessor(cto);
		cto.setSuccessor(hr);
		hr.setSuccessor(boss);
		return lead;
	}
	
}
