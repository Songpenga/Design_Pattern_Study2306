package design_Pattern.Strategy;

public class GaussSumStrategy implements SumStrategy{

	@Override
	public int get(int N) {
		// TODO Auto-generated method stub
		return (N+1)*N/2;
	}
	
}
