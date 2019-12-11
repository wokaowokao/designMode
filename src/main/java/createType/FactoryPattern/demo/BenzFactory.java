package createType.FactoryPattern.demo;

/**
 * @author zhangyawei Created on 2019/12/11.
 * 和 简单工厂不用 多加一个 抽象工厂类 实现的工厂 实现这个抽象工厂
 */
public class BenzFactory extends Factory {

    @Override
    Car create() {
        return null;
    }
}
