import java.util.regex.MatchResult;

//Test class for testing of matrix / vector calculations
public class Test {

	public static void main(String[] args) {
		//MATRIZEN DEFINIEREN
		MatrixFourD m1 = new MatrixFourD(new double[][]{{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}});
		MatrixFourD m2 = new MatrixFourD(new double[][] {{12,4,3,5},{5,8,-3,6},{2,3,0,0},{1,-1,5,-6}});
		MatrixFourD m3 = new MatrixFourD(new double[][] {{2,3,4,5},{2,3,4,5},{2,3,4,5},{2,3,4,5}});
		MatrixFourD m4 = new MatrixFourD(new double[][] {{3,2,-1,4},{1,5,0,2},{1,-2,4,1},{3,1,-2,5}});
		MatrixFourD m5 = new MatrixFourD(new double[][] {{-3,2,0,1},{0,2,3,-2},{-1,0,3,1},{5,2,1,3}});

		//VEKTOREN DEFINIEREN
		Vector v1 = new Vector(new double[] {1,2,3});
		Vector v2 = new Vector(new double[] {5,6,7});
		Vector v3 = new Vector(new double[] {-1,0,4});

		//MATRIZEN MULTIPLIZIEREN
		System.out.println("\nMATRIZEN MULTIPLIZIEREN:");
		MatrixFourD mResult1 = m1.mult(m2);
		MatrixFourD mResult2 = m2.mult(m3);
		MatrixFourD mResult3 = m4.mult(m5);
		mResult1.printMatrix();
		System.out.println();
		mResult2.printMatrix();
		System.out.println();
		mResult3.printMatrix();

		//MATRIX MIT SKALAR MULTIPLIZIEREN
		System.out.println("\nMATRIZEN MIT SKALAR MULTIPLIZIEREN:");
		m1.mult(3);
		m2.mult(5);
		m1.printMatrix();
		System.out.println();
		m2.printMatrix();

		//SKALARPRODUKT BERECHNEN
		System.out.println("\nSKALARPRODUKT BERECHNEN:");
		double s1 = v1.dot(v2);
		double s2 = v2.dot(v3);
		System.out.println("Skalarprodukt v1 und v2: " + s1);
		System.out.println("Skalarprodukt von v2 und v3: " + s2);

		//KREUZPRODUKT BERECHNEN
		System.out.println("\nKREUZPRODUKT BERECHNEN:");
		Vector vp1 = v1.cross(v2);
		Vector vp2 = v1.cross(v3);
		System.out.println("Kreuzprodukt v1 und v2: " + vp1.toString());
		System.out.println("Kreuzprodukt v1 und v3: " + vp2.toString());


		//LÄNGE EINES VEKTOR BERECHNEN
		System.out.println("\nLÄNGE EINES VEKTORS BERECHNEN:");
		System.out.println("Länge von v1: " + v1.length());
		System.out.println("Länge von v2: " + v2.length());
	}

}