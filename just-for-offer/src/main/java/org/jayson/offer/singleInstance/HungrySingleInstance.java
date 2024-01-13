package org.jayson.offer.singleInstance;

public class HungrySingleInstance {

    private volatile static HungrySingleInstance singleInstance = new HungrySingleInstance();


    private HungrySingleInstance() {}


    public static HungrySingleInstance getSingleInstance() {
        return singleInstance;
    }
}
