package kapitel0.aufgabe1;

import java.text.DateFormat;
import java.text.ParseException;

public class Birthday {
	private String theDay;

	public Birthday(String s) throws InvalidBirthdayException {
		try {
			checkDay(s);
		} catch (InvalidBirthdayException e) {
			throw new InvalidBirthdayException();
		}
		theDay = s;

	}

	public void checkDay(String s) throws InvalidBirthdayException {

		DateFormat df = DateFormat.getDateInstance();
		df.setLenient(false);

		try {
			df.parse(s);
		} catch (ParseException e) {
			throw new InvalidBirthdayException();
		}

	}

}
