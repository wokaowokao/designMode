package createType.SingletonPattern;

/**
 * @author zhangyawei Created on 2019/12/11.
 * 饿汉式
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();
    private Singleton2 (){}
    public static Singleton2 getInstance() {
        return instance;
    }
}