package tutorialExceptions2;

public class FalseIdException extends Exception {

	public FalseIdException(String s) {
		System.err.println(s);
	}

	public FalseIdException() {
		System.err.println("Falsche Id eingegeben");
	}

}
