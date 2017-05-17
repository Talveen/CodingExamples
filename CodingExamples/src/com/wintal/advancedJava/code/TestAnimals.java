package com.wintal.advancedJava.code;

public class TestAnimals {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Animal b = new Horse();
		
		a.eat();
		b.eat();
		
		/*
		 *  The below code gives error as it gives a typemismatch error. Cant convert Animal to Horse 
		Horse c = new Horse();
		Horse d = new Animal();
		c.eat();
		d.eat();*/
		
	}

}
