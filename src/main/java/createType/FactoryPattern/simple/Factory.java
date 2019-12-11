package createType.FactoryPattern.simple;

/**
 * @author zhangyawei Created on 2019/12/11.
 * 通常一个 工厂类
 */
public class Factory {
    public static Car getCarInstance(String type) {
        Car c = null;
        if ("Benz".equals(type)) {
            c = new Benz();
        }
        if ("Ford".equals(type)) {
            c = new Ford();
        }
        return c;
    }
}
