package org.itstep;

public class AppRunner {

	public static void main(String[] args) {
		
		char b = '"';
		char c = '/';
		char f = 92;
				
			System.out.println (""+ b + c + b + " Alex " + b + c + b);
			System.out.println (""+b + f + b + " Alex " + b + f + b);
			System.out.println (+b + f + b + " Alex " + b + f + b);
	}
}
