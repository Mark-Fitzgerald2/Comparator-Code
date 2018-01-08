package rationalComparator;
import java.util.Comparator;
public class RationalComparator implements Comparator<Rational> {
	@Override
	public int compare(Rational r1, Rational r2) {
		return (r2.getNumerator() * r1.getDenominator()) - (r1.getNumerator() * r2.getDenominator());
	}
	
}
