package structType.Bridge;


////绿圆 和 红圆 的功能 按照正常的 思路 可能是 继承 Shape 来实现draw的方法
////但是 如果那样 就不能 单独的去修改 各自的方法
////加入 drawapi 做桥接 双方可以独立变化
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
