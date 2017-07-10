package com.wintal.practise.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    while ((s = in.readLine()) != null) {

			char[] charSet = s.toCharArray();
			String resultString = "";

			for(int i = 1; i < charSet.length; i++)
			{
			    int s1 = Character.getNumericValue(charSet[i-1]);
			    int s2 = Character.getNumericValue(charSet[i]);
			    resultString += s1;
			    if(s1 % 2 != 0 && s2 % 2 != 0) {
			    	resultString += "-";
			    }
			    else if(s1 % 2 == 0 && s2 % 2 == 0 && s2!=0) {
			    	resultString += "*";
			    }
			}
			resultString += charSet[charSet.length - 1];
			System.out.println(resultString);
	    }
		
		
	}

}
