package com.diaoby.thread02.ch08;

public class OutClass {
	static class InnerClass1{
		public void method1(InnerClass2 class2) {
			String threadName = Thread.currentThread().getName();
			synchronized (class2) {
				System.out.println(threadName+" 进入InnerClass1类的method1方法");
				for(int i =1;i<10;i++) {
					System.out.println("i= "+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(threadName+" 离开InnerClass1类的method1方法");
			}
		}
		
		public synchronized void method2() {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName+" 进入InnerClass1类的method2方法");
			for(int j =11;j<20;j++) {
				System.out.println("j= "+j);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(threadName+" 离开InnerClass1类的method2方法");
		}
	}
	
	static class InnerClass2{
		public synchronized void method1() {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName+" 进入InnerClass2类的method1方法");
			for(int k =1;k<10;k++) {
				System.out.println("k= "+k);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(threadName+" 离开InnerClass2类的method1方法");
		}
	}	
}
