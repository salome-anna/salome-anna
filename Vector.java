import java.util.Arrays;

public class MyVector {
    protected double[] elements = new double[3];

    MyVector() {
        for (int i = 0; i < 3; i++) {
            this.elements[i] = 0.0;
        }
    }

    MyVector(double[] elements) {
        for (int i = 0; i < 3; i++) {
            this.elements[i] = elements[i];
        }
    }

    double dot(MyVector v) {
        double result = 0.0;

        if (result == 0) {
            for (int i = 0; i < 3; i++) {
                result += this.elements[i] * v.elements[i];
            }
        } else result = 0;
        return result;
    }

    MyVector cross(MyVector v) {
        MyVector result = new MyVector();

        for (int j = 0; j < 3; j++) {
            switch (j) {
                case 0:
                    result.elements[0] = this.elements[1] * v.elements[2] - this.elements[2] * v.elements[1];
                case 1:
                    result.elements[1] = this.elements[2] * v.elements[0] - this.elements[0] * v.elements[2];
                case 2:
                    result.elements[2] = this.elements[0] * v.elements[1] - this.elements[1] * v.elements[0];
            }
        }
        return result;
    }

    double length() {
        double l = 0.0;
        double result = 0.0;

        for (int i = 0; i < 3; i++) {
            l += Math.pow(this.elements[i], 2);
        }

        result = Math.sqrt(l);
        return result;
    }

    void printVector() {
        for (int i = 0; i < 3; i++) {
            System.out.print(this.elements[i] + " ");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
