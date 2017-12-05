package com.diaoby.pattern.facade;
/**
 * 外观模式也叫门面模式
 * @author Administrator
 *
 */
public class FacadeClient {
	public static void main(String[] args) {
		//全部开启，一个个掉
		Elec ac = new Ac();
		Elec ligth = new Ligth();
		Elec tv = new TV();
		ligth.on();
		tv.on();
		ac.on();
		//用门面模式来做
		System.out.println("===============门面模式====================");
		ElecFacade.on();
		ElecFacade.off();
	}
}
