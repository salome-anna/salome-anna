//Test class for testing of matrix / vector calculations
public class Test {

	public static void main(String[] args) {
		//MATRIZEN DEFINIEREN
		Matrix4D m1 = new Matrix4D(new double[][]{{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}});
		Matrix4D m2 = new Matrix4D(new double[][] {{12,4,3,5},{5,8,-3,6},{2,3,0,0},{1,-1,5,-6}});
		Matrix4D m3 = new Matrix4D(new double[][] {{2,3,4,5},{2,3,4,5},{2,3,4,5},{2,3,4,5}});
		Matrix4D m4 = new Matrix4D(new double[][] {{3,2,-1,4},{1,5,0,2},{1,-2,4,1},{3,1,-2,5}});
		Matrix4D m5 = new Matrix4D(new double[][] {{-3,2,0,1},{0,2,3,-2},{-1,0,3,1},{5,2,1,3}});

		//VEKTOREN DEFINIEREN
		Vector v1 = new Vector(new double[] {1,2,3});
		Vector v2 = new Vector(new double[] {5,6,7});
		Vector v3 = new Vector(new double[] {-1,0,-4});
		Vector v4 = new Vector(new double[] {1,2,3,4});

		//MATRIZEN MULTIPLIZIEREN
		System.out.println("\nMULTIPLY MATRICES:");
		Matrix4D mResult1 = m1.mult(m2);
		Matrix4D mResult2 = m2.mult(m3);
		Matrix4D mResult3 = m4.mult(m5);
		mResult1.printMatrix();
		System.out.println();
		mResult2.printMatrix();
		System.out.println();
		mResult3.printMatrix();

		//MATRIX MIT SKALAR MULTIPLIZIEREN
		System.out.println("\nMULTIPLY MATRIX WITH SCALAR:");
		m1.mult(3);
		m2.mult(5);
		m1.printMatrix();
		System.out.println();
		m2.printMatrix();

		//MATRIX MIT VEKTOR MULTIPLIZIEREN
		System.out.println("\nMULTIPLY MATRIX WITH VECTOR:");
		m1.mult(v4);
		System.out.println(m1.mult(v4));


		//SKALARPRODUKT BERECHNEN
		System.out.println("\nCALCULATE INNER PRODUCT:");
		double s1 = v1.dot(v2);
		double s2 = v2.dot(v3);
		System.out.println("Inner product v1 & v2: " + s1);
		System.out.println("Inner product v2 & v3: " + s2);

		//KREUZPRODUKT BERECHNEN
		System.out.println("\nCALCULATE CROSS PRODUCT:");
		Vector vp1 = v1.cross(v2);
		Vector vp2 = v1.cross(v3);
		System.out.println("Cross product v1 & v2: " + vp1.toString());
		System.out.println("Cross product v1 & v3: " + vp2.toString());


		//LÄNGE EINES VEKTOR BERECHNEN
		System.out.println("\nCALCULATE LENGTH OF VECTOR:");
		System.out.println("Length of v1: " + v1.length());
		System.out.println("Length of v2: " + v2.length());
	}

}