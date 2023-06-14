package design_Pattern.Strategy;

public class SumPrinter { // N 까지의 총합
	void print(SumStrategy strategy, int N) {
		System.out.printf("The Sum of 1 - %d : ", N);
		System.out.println(strategy.get(N));
	}

}
