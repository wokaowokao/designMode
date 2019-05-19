package structType.FlyweightPattern;

import java.util.HashMap;

public class ShapeFactory {
    //对 hashmap 来说 final 只有 circleMap = new HashMap 时 才会报错
    private static final HashMap<String, Shape> circleMap = new HashMap();

    public static Shape getCircle(String color) {

        //保证每一种 颜色的circle一个
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}