package kapitel2.aufgabe3;

public class Star implements Mobile {
	
	protected double gewicht;
	
	public Star(double gewicht) throws IllegalArgumentException{
		
		if (gewicht<0)
			throw new IllegalArgumentException();
		else
			this.gewicht=gewicht;		
	}
	
	public void balance(){};
	
	public double weight(){
		return gewicht;
	}
	
	

}
