package com.diaoby.thread03.ch02;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	private List list = new ArrayList();
	
	synchronized public void push(){
		try {
			if(list.size()==1) {
				System.out.println("Thread Name:"+Thread.currentThread().getName()+"  waiting " + list.size());
				this.wait();
			}
			list.add(Math.random()+"");
			this.notify();
			System.out.println("Thread Name:"+Thread.currentThread().getName()+"  push OK "+ list.size());
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
	synchronized public String pop() {
		String value="";
		try {
			if(list.size()==0) {
					System.out.println("Thread Name:"+Thread.currentThread().getName()+" waiting " + list.size());
				this.wait();
			}
			value = (String)list.get(0);
			list.remove(0);
			this.notify();
			System.out.println("Thread Name:"+Thread.currentThread().getName()+" pop OK "+list.size());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
}
