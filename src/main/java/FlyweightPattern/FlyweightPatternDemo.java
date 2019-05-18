package FlyweightPattern;


//String常量池、数据库连接池、缓冲池等等都是享元模式的应用
public class FlyweightPatternDemo {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {
        //享元设计模式 应该是 多个类有部分属性公用

        //用HashMap<String, Shape> 来 控制 类的数量 一种颜色是一个实例
        //之前生产的类 的属性会被新的属性所覆盖
        // 所以之前生成的类 如果被覆盖类 就再也找不回之前的属性了
        for(int i=0; i < 20; ++i) {
            //创建对象
            Circle circle =
                    (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
