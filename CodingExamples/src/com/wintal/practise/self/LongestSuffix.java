package com.wintal.practise.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestSuffix {
	public static void main(String[] args) throws IOException {
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String s;
			while ((s = in.readLine()) != null) {
			    String[] sSplit = s.split(",");
	            String sRev = sSplit[0].trim();
	            String sRev2 = sSplit[1].trim();
	            System.out.println(sRev);
	            System.out.println(sRev2);
				String small, large;
				if (sRev.length() > sRev2.length()) {
					small = sRev2;
					large = sRev;
				} else {
					small = sRev;
					large = sRev2;
				}
				int index = 0;
				for (char c : large.toCharArray()) {
					if (index == small.length())
						break;
					if (c != small.charAt(index))
						break;
					index++;
				}
				
				String result = new StringBuffer(large.substring(0, index)).reverse().toString();
				if (index == 0)
					System.out.println("NULL");
				else
					System.out.println(result);
		}
	}
}
