package org.dgqbcht.algorithm.math;

public class MaxCommonFactor {
	public static int getMaxCommonFactor(int a, int b) {
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		int c;
		while (b != 0) {
			c = a % b;
			a = b;
			b = c;
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.println(MaxCommonFactor.getMaxCommonFactor(15, 5));
		System.out.println(MaxCommonFactor.getMaxCommonFactor(5, 15));
	}

}
