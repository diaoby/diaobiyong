package com.diaoby.pattern.chain;
/**
 * 处理人，负责处理请假申请
 * @author Administrator
 *
 */
public abstract class LeaveHandler {
	//后续处理人
	protected LeaveHandler successor;
	public void setSuccessor(LeaveHandler successor) {
		this.successor = successor;
	}
	public abstract void disposeLeave(int day);
	
}
