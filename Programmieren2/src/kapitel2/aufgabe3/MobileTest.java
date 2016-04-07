package kapitel2.aufgabe3;

public class MobileTest {

	public static void main(String[] args) {

		Star s1 = new Star(2);
		GlitterStar s2 = new GlitterStar(4);
		Star s3 = new Star(9);

		s2.decorate();
		s2.decorate();
		s2.decorate();

		Wire w1 = new Wire(9, s1, s2);
		Wire w2 = new Wire(10, w1, s3);

		System.out.println(w1.knotPos);
		System.out.println(w2.knotPos);

	}

}
