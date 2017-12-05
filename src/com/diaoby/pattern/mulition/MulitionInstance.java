package com.diaoby.pattern.mulition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * 多例---这里实现2个实例
 * @author Administrator
 *
 */
public class MulitionInstance {
	//列表只能存放2个数据
	private static List<MulitionInstance> list= new ArrayList<MulitionInstance>(2);
	private String name;
	//私有的构造方法，不让外部new出来，对象都是自己生产
	private MulitionInstance() {}
	//静态方法，自己new2个对象
	static {
		list.add(new MulitionInstance("大老婆"));
		list.add(new MulitionInstance("小老婆"));
	}
	
	private MulitionInstance(String name) {
		this.name = name;
	}
	
	public static MulitionInstance getInstance(String name) {
		Iterator<MulitionInstance> it = list.iterator();
		MulitionInstance mulit = null;
		while(it.hasNext()) {
			mulit = it.next();
			if(mulit.name.equals(name)) {
				break;
			}
		}
		return mulit;
	}
	
	public static MulitionInstance getRandomInstance() {
		Random random = new Random();
		int index = random.nextInt(2);
		return list.get(index);
	}
	
	public void desc() {
		System.out.println(name+"====hascode:"+this.hashCode());
	}

}
