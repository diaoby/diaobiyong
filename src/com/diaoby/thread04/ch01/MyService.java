package com.diaoby.thread04.ch01;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	public Condition condition = lock.newCondition();
	
	public void await() {
		try {
			lock.lock();
			System.out.println("await 时间为"+System.currentTimeMillis());
			condition.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("await unlock"+System.currentTimeMillis());
			lock.unlock();
		}
	}
	public void singal() {
		try {
			lock.lock();
			System.out.println("singal 时间为"+System.currentTimeMillis());
			condition.signal();
		}finally {
			System.out.println("singal unlock"+System.currentTimeMillis());
			lock.unlock();
		}
	}
}
