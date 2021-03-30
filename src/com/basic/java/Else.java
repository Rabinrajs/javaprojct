package com.basic.java;

public class Else {
	public static void main(String[] args) {
		int mark=100;
		if (mark<50) {
			System.out.println("fail");
			
		}else if (mark>55 && mark<65) {
			System.out.println("third class");
		}else if (mark>70 && mark<80) {
			System.out.println("seconf class");
		}else if (mark>85 && mark<100) {
			System.out.println("first class");
		}else {
		    System.out.println("pass");
		}
	}

}
