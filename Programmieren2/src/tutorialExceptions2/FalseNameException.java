package tutorialExceptions2;

public class FalseNameException extends Exception {

	public FalseNameException(String s) {
		System.err.println(s);
	}

	public FalseNameException() {
		System.err.println("Der eingegebene Name ist Falsch");

	}

}
