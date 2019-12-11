package createType.FactoryPattern.abstractzz;

import createType.FactoryPattern.demo.Car;

/**
 * @author zhangyawei Created on 2019/12/11.
 * 工厂模式 的抽象类 是产生单一的产品 多个产品 需要多个 具体工厂
 * 抽象工厂是 产生多个产品 一个具体工厂
 */
public class DefaultFactory extends Factory {

    @Override
    Car createBenz() {
        return null;
    }

    @Override

    Car createFord() {
        return null;
    }
}
