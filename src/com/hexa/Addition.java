package com.hexa;

import java.util.Scanner;

public class Addition {
	int num1, num2, result; // class variables

	Addition() {

	}

	Addition(int num1, int numw2) {

		this.num1 = num1;
		this.num2 = num2;
	}

	int call() {
		result = num1 + num2;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter inputs");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Addition ad = new Addition(a,b);
		System.out.println("The result is:"+(ad.call()+2));
		}

}
