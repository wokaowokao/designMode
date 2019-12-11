package createType.FactoryPattern.deom;

import createType.FactoryPattern.demo.Car;

/**
 * @author zhangyawei Created on 2019/12/11.
 */
public class Benz implements Car {

    @Override
    public void run() {
        System.out.println("Benz");
    }
}
