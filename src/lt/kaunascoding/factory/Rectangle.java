package lt.kaunascoding.factory;

public class Rectangle implements Shape {
    private float width;
    private float height;

    public Rectangle(float parWidth, float parHeight) {
        width = parWidth;
        height = parHeight;
    }

    @Override
    public float draw() {
        float result = (width * height);
        System.out.println("Rectangle: " + result);
        return result;

    }
}
