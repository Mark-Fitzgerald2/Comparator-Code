package rationalComparator;

public class Rational implements Comparable<Rational>{
	private int numerator;
	private int denominator;
	
	public Rational(int n, int d) {
		numerator = n;
		denominator = d;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void add(Rational r) {
		int tempTop = (numerator * r.denominator) + (r.numerator * denominator);
		int tempBottom = (denominator * r.denominator);
		
		simplify(tempTop, tempBottom);
	}
	
	public void subtract(Rational r) {
		int tempTop = (numerator * r.denominator) - (r.numerator * denominator);
		int tempBottom = (denominator * r.denominator);
		
		simplify(tempTop, tempBottom);
	}
	
	public void multiply(Rational r) {
		int tempTop = (numerator * r.numerator);
		int tempBottom = (denominator * r.denominator);
		
		simplify(tempTop, tempBottom);
	}
	
	public void divide(Rational r) {
		int tempTop = (numerator * r.denominator);
		int tempBottom = (denominator * r.numerator);
		
		simplify(tempTop, tempBottom);
	}

	private void simplify(int tempTop, int tempBottom) {
		int r;
		int x = tempTop;
		int y = tempBottom;
		while(y!=0) {
			r=x%y;
			x = y;
			y = r;
		}
		
		numerator = tempTop/x;
		denominator = tempBottom/x;
	}
	
	public String toString() {
		double num = (double) numerator/denominator;
		return numerator + "/" + denominator + " = " + (num);
	}
	
	@Override
	public int compareTo(Rational r) {
		return (numerator * r.denominator) - (r.numerator * denominator);
	}
}
