package com.diaoby.thread02.ch05;

public class PublicClass {
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	class PrivateClass {
		private String age;
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		private String address;
		
		public void printPublicProperty() {
			System.out.println("userName="+userName+" password="+password);
		}
		
	}
}
