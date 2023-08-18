package com.elam;

public class Test01 {
	public static void main(String[] args) {
	int a = 152, n = 0;
		int i = 0, j = 0;
		n = a;
		while (a > 0) {
			i = a % 10;
			j = j + (i * i * i);
			a = a / 10;
		}
		if (n == j) {
			System.out.println("Amstrong");
		} else {
			System.out.println("Not a amstrong number");
		}
	}
}
