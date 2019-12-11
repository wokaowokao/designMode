package createType.SingletonPattern;

/**
 * @author zhangyawei Created on 2019/12/11.
 */
public class singleObjectStatic {
    private static class SingletonHolder {
        private static final singleObjectStatic INSTANCE = new singleObjectStatic();
    }
    private singleObjectStatic (){}
    public static final singleObjectStatic getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
