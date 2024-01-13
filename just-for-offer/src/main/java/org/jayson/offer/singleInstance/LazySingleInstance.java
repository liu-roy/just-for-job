package org.jayson.offer.singleInstance;

public class LazySingleInstance {

    private volatile static LazySingleInstance singleInstance;

    private LazySingleInstance() {}


    public static LazySingleInstance getSingleInstance() {
        if (singleInstance == null) {
            synchronized (LazySingleInstance.class) {
                if (singleInstance == null) {
                    singleInstance = new LazySingleInstance();
                }
            }
        }
        return singleInstance;
    }
}
