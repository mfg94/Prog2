package tutorialExceptions2;

public class Person {

	private String vorname;
	private String nachname;
	private int id;

	public void setVorname(String vorname) throws FalseNameException {
		if (this.hasNumber(vorname) == true)
			throw new FalseNameException();
		else
			this.vorname = vorname;
	}

	public void setNachname(String nachname) throws FalseNameException {
		if (this.hasNumber(nachname) == true)
			throw new FalseNameException();
		else
			this.nachname = nachname;
	}

	public void setId(int id) {
		
		this.id = id;
	}

	public String getVorname() {
		return this.vorname;
	}

	public String getNachname() {
		return this.nachname;
	}

	public int getId() {
		return this.id;
	}

	public boolean hasNumber(String s) {
		char[] a = s.toCharArray();
		for (char b : a) {
			if (Character.isDigit(b))
				return true;
		}
		return false;
	}
	

}
