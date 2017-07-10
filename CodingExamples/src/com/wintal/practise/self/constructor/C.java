package com.wintal.practise.self.constructor;

public class C extends B {
	
	static{
		System.out.println("static C");
	}
	
	public C() {
		System.out.println("constructing C");
	}
	public void m3(){
		System.out.println("print m3");
	}
}
