package source;

public abstract class Plan {

	protected double rate;
	abstract void getrate();
	
	public void calculateBill(int units) {
		System.out.println(rate*units);
	}
}
