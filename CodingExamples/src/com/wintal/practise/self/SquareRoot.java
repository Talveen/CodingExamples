package com.wintal.practise.self;

import java.util.Scanner;

public class SquareRoot {
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		double num = scanner.nextDouble();
		double x = Math.pow(num, 0.5);
		System.out.println(x);
	}

}
