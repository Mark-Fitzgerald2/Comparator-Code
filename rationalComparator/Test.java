package rationalComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		Rational r1 = new Rational(2,3);
		Rational r2 = new Rational(3,4);
		Rational r3 = new Rational(2,3);
		Rational r4 = new Rational(2,3);
		Rational r5 = new Rational(2,3);
		
		System.out.println(r1);
		System.out.println(r2);
		r1.add(r2);
		System.out.println("Addition: " + r1);
		r3.subtract(r2);
		System.out.println("Subtraction: " + r3);
		r4.multiply(r2);
		System.out.println("Multiplication: " + r4);
		r5.divide(r2);
		System.out.println("Division: " + r5);
		
		ArrayList<Rational> list = new ArrayList<Rational>();
		list.add(new Rational(2,3));
		list.add(new Rational(4,5));
		list.add(new Rational(7,12));
		list.add(new Rational(3,4));
		list.add(new Rational(6,5));
		list.add(new Rational(8,27));
		list.add(new Rational(9,16));
		list.add(new Rational(3,7));
		
		System.out.println("Unsorted array: ");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		Collections.sort(list);
		System.out.println("\nSorted array: ");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		/*
		int pos = Collections.binarySearch(list, r1);
		if(pos<0) {
			list.add(-pos-1, r1);
		} else {
			System.out.println(r1 + " found at position " + pos);
		}
		System.out.println("\nAfter binary search: ");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		/*
		Collections.sort(list, new RationalComparator());
		System.out.println("\nSorted array in descending order: ");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}*/
	//	Collections.sort(list);
		Rational r9 = new Rational(2,3);
		int pos2 = Collections.binarySearch(list, r9);
		if(pos2<0) {
			list.add(-pos2-1, r9);
		} else {
			System.out.println(r9 + " found at position " + pos2);
		}
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
