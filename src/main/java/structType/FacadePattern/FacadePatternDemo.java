package structType.FacadePattern;

//外观模式
//隐藏了系统的复杂性
//提供一个类 客户端可以简化调用 系统复杂实现的方法
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}