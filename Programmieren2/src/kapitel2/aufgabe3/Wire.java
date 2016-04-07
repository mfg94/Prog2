package kapitel2.aufgabe3;

public class Wire implements Mobile {

	double length, knotPos;
	Mobile left, right;

	public Wire(double length, Mobile left, Mobile right) {
		this.length = length;
		this.left = left;
		this.right = right;
		this.balance();
	}

	public double weight() {
		return left.weight() + right.weight();
	}

	public void balance() { 

		for (double i = 0; i < this.length; i++) {
			if (left.weight() * i == right.weight() * (length - i)) {
				knotPos = i;
				break;
			} else
				continue;

		}

	}

}
