package org.dgqbcht.algorithm.math;

public class LeastCommonMultiple {

	public static int getLeastCommonMultiple(int a, int b) {
		return a * b / MaxCommonFactor.getMaxCommonFactor(a, b);
	}

	public static void main(String[] args) {
		System.out.println(LeastCommonMultiple.getLeastCommonMultiple(10, 15));
		System.out.println(LeastCommonMultiple.getLeastCommonMultiple(5, 15));
	}

}
