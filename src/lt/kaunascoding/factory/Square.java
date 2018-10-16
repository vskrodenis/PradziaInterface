package lt.kaunascoding.factory;

public class Square implements Shape {
    private float legth;

    public Square(float parLength) {
        legth = parLength;

    }

    @Override
    public float draw() {
        float result = (legth * legth);
        System.out.println("Square: " + result);
        return result;
    }
}
