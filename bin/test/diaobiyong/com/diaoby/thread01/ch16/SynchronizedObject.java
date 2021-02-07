package com.diaoby.thread01.ch16;

public class SynchronizedObject {
	private String username="a";
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password="aa";
	
	synchronized public void pringString(String username,String password) {
		try {
			this.username = username;
			Thread.sleep(100000);
			this.password = password;
		} catch (InterruptedException e) {
			System.out.println("==pringString==");
			e.printStackTrace();
		}
	}
			
}
