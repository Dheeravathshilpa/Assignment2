package com.si.day2;

public class MainClass {
	public static void main(String[] args) {
		NormalClass n1= new NormalClass();
		System.out.println(n1.a);
		n1.display();
		System.out.println(NormalClass.b);
		NormalClass.display1();
	}

}
