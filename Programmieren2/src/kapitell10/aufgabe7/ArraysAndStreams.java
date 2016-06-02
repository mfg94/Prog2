package kapitell10.aufgabe7;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysAndStreams {

	public static void main(String[] args) {
		int[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

		// display original values
		System.out.printf("Original values: %s%n", Arrays.asList(values));

		// Ausgabe aller Werte von values in aufsteigender Reihenfolge
		IntStream.of(values).sorted().forEach(i -> System.out.print(i + " "));

		System.out.println();
		// Ausgabe aller Werte in values, die größer als 4 sind
		IntStream.of(values).filter(p -> p > 4)
				.forEach(p -> System.out.print(p + " "));

		
		System.out.println();

		// Filtern von allen Werten in values, die größer als 4 sind, und
		// sortierte diese anschließend
		IntStream.of(values).filter(p -> p > 4).sorted()
				.forEach(p -> System.out.print(p + " "));
	}

}
