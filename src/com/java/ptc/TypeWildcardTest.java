package com.java.ptc;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// file TypeWidecardTest
public class TypeWildcardTest {
	private static final Logger logger = LoggerFactory.getLogger(TypeWildcardTest.class);

	public static void printSquare(List<? extends Number> numbers) {
		for (Number n : numbers) {
			double d = n.doubleValue();
			System.out.println(d * d);
		}
	}

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		ints.add(3);
		printSquare(ints);
	}
}