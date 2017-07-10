package com.wintal.practise.self.constructor;

public class B extends A {
	
	static{
		System.out.println("static B");
	}
	
	public B() {
		System.out.println("constructing B");
	}
	public void m2(){
		System.out.println("print m2");
	}
}
