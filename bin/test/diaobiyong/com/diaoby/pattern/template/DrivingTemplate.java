package com.diaoby.pattern.template;
/**
 * 代驾模板服务
 * @author Administrator
 *
 */
public abstract class DrivingTemplate {
	public void driving() {
		System.out.println("================代驾开始=========");
		getdrivingCompany();
		getdrivingUser();
		int money = getMoney();
		double discount = discount();
		if(discount!=1) {
			System.out.println("此次出行一共"+money+"元,打"+discount*10+"折"+"一共"+money*discount+"元");
		}else {
			System.out.println("此次出行一共"+money+"元");
		}
		giveMoney();
		System.out.println("================代驾结束=========");
	}
	//代驾公司 抽象的，由子类实现
	abstract void getdrivingCompany();
	abstract void getdrivingUser();
	abstract int getMoney();
	//钩子函数，默认不打折
	protected double discount() {
		return 1;
	}
	private final void giveMoney(){
		System.out.println("================我付完钱=========");
	}
	
}
