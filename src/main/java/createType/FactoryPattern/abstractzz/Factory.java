package createType.FactoryPattern.abstractzz;

import createType.FactoryPattern.demo.Car;

/**
 * @author zhangyawei Created on 2019/12/11.
 * 通常一个 工厂类
 */
public abstract class Factory {
    abstract Car createBenz();
    abstract Car createFord();

}
