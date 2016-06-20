package tutorialStreamIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class Umwandle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer = null;
		FileReader reader = null;
		char c = ' ';
		int i;

		if (args.length != 2) {
			System.err.println("Usage umwandle file1 file2");
			System.exit(1);
		}

		reader = new FileReader(args[0]);
		writer = new FileWriter(args[1]);
		

		while ((i = reader.read()) != -1) {
			if ((char) i == 'X') {
				System.out.println(' ');
				writer.write(' ');
			} else if ((char) i == ' ') {
				System.out.println('X');
				writer.write('X');
			} else {
				System.out.println((char) i);
				c = (char) i;
				writer.write(c);
			}

		}

		reader.close();
		writer.close();

	}

}
