package kapitell10.aufgabe3;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.*;

public class CalculatorLambda {

	public static void main(String... args) {

		IntBinaryOperator addition = (a, b) -> a + b;
		IntBinaryOperator subtraction = (a, b) -> a - b;
		
		//Aufgabe a
		IntBinaryOperator division = (a, b) -> a / b;
		IntBinaryOperator multiplication = (a, b) -> a * b;
		
		//Aufgabe b
		IntFunction<Integer> increment = (int a) -> a+1;
		IntFunction<Integer> decrement = (int a) -> a-1;

		System.out.println("40 + 2 = " + addition.applyAsInt(40, 2));
		System.out.println("20 - 10 = " + subtraction.applyAsInt(20, 10));
		
		//Aufgabe a
		System.out.println("20 / 4 = " + division.applyAsInt(20, 4));
		System.out.println("20 * 5 = " + multiplication.applyAsInt(20, 5));
		
		//Aufgabe b
		System.out.println("inc(20) = " + increment.apply(20));
		System.out.println("dec(20) = " + decrement.apply(20));

	}

}
