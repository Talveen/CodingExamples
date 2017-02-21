package com.wintal.dbs.practise;

import java.util.Scanner;

public class StairCase {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=n;i>=1;i--){
			int k=i;int j=i-1;
			while(k!=1){
				System.out.print(" ");
				k=k-1;
			}
			while(j!=n){
				System.out.print("#");
				j=j+1;
			}
			System.out.println();
		}
	}
}
