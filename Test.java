//Test class for testing of matrix / vector calculations
public class Test {

	public static void main(String[] args) {
		//DEFINE MATRICES
		MyMatrix4D m1 = new MyMatrix4D(new double[][]{{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}});
		MyMatrix4D m2 = new MyMatrix4D(new double[][] {{12,4,3,5},{5,8,-3,6},{2,3,0,0},{1,-1,5,-6}});
		MyMatrix4D m3 = new MyMatrix4D(new double[][] {{2,3,4,5},{2,3,4,5},{2,3,4,5},{2,3,4,5}});
		MyMatrix4D m4 = new MyMatrix4D(new double[][] {{3,2,-1,4},{1,5,0,2},{1,-2,4,1},{3,1,-2,5}});
		MyMatrix4D m5 = new MyMatrix4D(new double[][] {{-3,2,0,1},{0,2,3,-2},{-1,0,3,1},{5,2,1,3}});

		//DEFINE VECTORS
		MyVector v1 = new MyVector(new double[] {1,2,3});
		MyVector v2 = new MyVector(new double[] {5,6,7});
		MyVector v3 = new MyVector(new double[] {-1,0,-4});
		MyVector v4 = new MyVector(new double[] {1,2,3,4});

		//MULTIPLY MATRIX WITH MATRIX
		System.out.println("\nMULTIPLY MATRICES:");
		MyMatrix4D mResult1 = m1.mult(m2);
		MyMatrix4D mResult2 = m2.mult(m3);
		MyMatrix4D mResult3 = m4.mult(m5);
		mResult1.printMatrix();
		System.out.println();
		mResult2.printMatrix();
		System.out.println();
		mResult3.printMatrix();

		//MULTIPLY MATRIX WITH SCALAR - not working YET
		System.out.println("\nMULTIPLY MATRIX WITH SCALAR:");
		MyMatrix4D mResult4 = m1.mult(3);
		MyMatrix4D mResult5 = m2.mult(5);
		mResult4.printMatrix();
		System.out.println();
		mResult5.printMatrix();

		//MULTIPLY MATRIX WITH VECTOR - only working with 3d vector
		System.out.println("\nMULTIPLY MATRIX WITH VECTOR:");
		//MyVector4D mResult6 = m1.mult(v4);
		//mResult6.printVector();

		//INNER PRODUCT
		System.out.println("\nCALCULATE INNER PRODUCT:");
		double s1 = v1.dot(v2);
		double s2 = v2.dot(v3);
		System.out.println("Inner product v1 & v2: " + s1);
		System.out.println("Inner product v2 & v3: " + s2);

		//CROSS PRODUCT
		System.out.println("\nCALCULATE CROSS PRODUCT:");
		MyVector vp1 = v1.cross(v2);
		MyVector vp2 = v1.cross(v3);
		System.out.println("Cross product v1 & v2: ");
		vp1.printVector();
		System.out.println("Cross product v1 & v3: ");
		vp2.printVector();


		//LENGTH OF VECTOR
		System.out.println("\nCALCULATE LENGTH OF VECTOR:");
		System.out.println("Length of v1: " + v1.length());
		System.out.println("Length of v2: " + v2.length());
	}

}