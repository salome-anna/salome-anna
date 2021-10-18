import java.util.Arrays;

public class Matrix4D {
    private double[][] elements = new double[4][4]; //zweidimensionales Array für Matrix

    public Matrix4D() {                               //Konstruktor
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    this.elements[i][j] = 1.0;      //Einheitsmatrix; praktisch, weil bei der Mult. damit dieselbe Matrix rauskommt
                } else {
                    this.elements[i][j] = 0.0;
                }
            }
        }
    }

    public Matrix4D(double[][] elements) {            //Konstruktor mit den Values
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                this.elements[i][j] = elements[i][j];
            }
        }
    }

    Matrix4D mult(Matrix4D matrix) {                   //Methode zur Matrixmultiplikation
        Matrix4D result = new Matrix4D();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                result.elements[i][j] = 0.0;       //um sicher zu stellen, dass alle Werte auf 0 sind
             for (int k = 0; k < 4; k++) {
                    result.elements[i][j] += this.elements[i][k] * matrix.elements[k][j];
                }
            }
        }
        return result;
    }

    Matrix4D mult(double s) {
        Matrix4D result = new Matrix4D();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                result.elements[i][j] = 0.0;       //um sicher zu stellen, dass alle Werte auf 0 sind
                    result.elements[i][j] = s * this.elements[i][j];
            }
        }
        return result;
    }

    Vector mult(Vector v) {
        Vector result = new Vector();

        for(int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                result.elements[i] += this.elements[i][j] * v.elements[j];
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    void printMatrix() {                           //Methode, um das Ergebnis(?) auszugeben; SOLL NUR DIE toString-METHODE AUFRUFEN => 1-ZEILER
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(this.elements[i][j] + " ");
            }
            System.out.println();
        }
    }
}
