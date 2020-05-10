package de.unistuttgart.vis.dsass2020.ex00.p1;

public class Calculator implements ICalculator {
	public int a = 0;
	public int b = 0;
	
	public int add(int a, int b) {
		return a+b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int minimum(int a, int b) {
		if (a<b) {
			return a;
		}
		else {
			return b;
		}
	}
	public int quersumme(int a) {
			if (a <= 9) return a;
			return a%10 + quersumme(a/10);
	}

}