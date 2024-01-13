package org.jayson.offer.singleInstance;

public class HoldSingleInstance {

    public static class HoldingSingleInstance {
        public static final HoldSingleInstance INSTANCE = new HoldSingleInstance();

    };
    private HoldSingleInstance() {}


    public static HoldSingleInstance getSingleInstance() {
        return HoldingSingleInstance.INSTANCE;
    }

}
