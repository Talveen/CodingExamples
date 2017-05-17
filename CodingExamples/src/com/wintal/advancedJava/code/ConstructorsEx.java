package com.wintal.advancedJava.code;

public class ConstructorsEx {
	{
		
		a3="TalveenA3";
	}
	
	private String a1;
	private String b1;
	private String a3; 
	
		
	public ConstructorsEx(){
		this.a1 = a3;
	}
	
	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public String getB1() {
		return b1;
	}

	public void setB1(String b1) {
		this.b1 = b1;
	}

	public ConstructorsEx(String a, String b){
		this.a1=a;
		this.b1=b;
	}
	
	public ConstructorsEx(String a){
		this(a, null);
	}
	
}
