public class MyVector4D {
    protected double[] elements = new double[4];

    MyVector4D() {
        for (int i = 0; i < 4; i++) {
            this.elements[i] = 0.0;
        }
    }

    MyVector4D(double[] elements) {
        for (int i = 0; i < 4; i++) {
            this.elements[i] = elements[i];
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        System.out.print("[ ");
        for (int i = 0; i < 4; i++) {
            System.out.print(this.elements[i] + " ");
        }
        System.out.println("]");
        return result.toString();
    }

    void printVector() {
        this.toString();
    }
}