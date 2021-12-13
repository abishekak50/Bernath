package com.hexa;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer value");
		int a = sc.nextInt();
		System.out.println("enter float value");
		float f = sc.nextFloat();
		System.out.println("enter name");
		String name = sc.next();
		sc.nextLine();
		System.out.println("Enter initial");
		char c = sc.next().charAt(0);
		System.out.println("integer :" + a);
		System.out.println("float :" + f);
		System.out.println("name :" + name);
		System.out.println("initial :" + c);
	}

}
