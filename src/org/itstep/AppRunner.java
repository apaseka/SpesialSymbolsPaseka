package org.itstep;

public class AppRunner {

	public static void main(String[] args) {
		
		char b = '"';
		char c = '/';
		char f = 92;
		String one = String.valueOf(f);
		String two = String.valueOf(b);
				
			System.out.println (""+ b + c + b + " Alex " + b + c + b);
			System.out.println (""+b + f + b + " Alex " + b + f + b);
			System.out.println (+b + f + b + " Alex " + b + f + b);
			System.out.println (two + one + two + " Alex " + two + one + two);
	}
}
