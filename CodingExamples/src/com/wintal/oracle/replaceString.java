package com.wintal.oracle;


import java.util.Scanner;
import java.util.regex.Pattern;;

public class replaceString {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String seq = scanner.next();
		String seqDel = scanner.next();
		System.out.println(seq.indexOf(seqDel));
		System.out.println(seq.replace(seqDel,""));
	}

}
