package lt.kaunascoding.factory;

import java.util.Scanner;

public class ShapeFactory {
    public ShapeFactory(Scanner sc) {
        float suma = 0;
        while(sc.hasNext()){
            Shape obj = getShape(sc.next(),sc);
            suma += obj.draw();
        }
        System.out.println("bendras plotas:" + suma);
    }

    public Shape getShape(String parName, Scanner sc) {
        Shape result = null;
        switch (parName.toLowerCase()) {
            case "square":
                result = new Square(sc.nextFloat());
                break;
            case "circle":
                result = new Circle(sc.nextFloat());
                break;
            case "rectangle":
                result = new Rectangle(sc.nextFloat(), sc.nextFloat());
                break;
        }

        return result;
    }


}
