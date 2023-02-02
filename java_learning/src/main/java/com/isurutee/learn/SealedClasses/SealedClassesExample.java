package com.isurutee.learn.SealedClasses;

import com.isurutee.learn.common.IExample;

public class SealedClassesExample implements IExample {

    public abstract sealed class FruitSealed permits AppleSealed, PearSealed {
    }
    public non-sealed class AppleSealed extends FruitSealed {
    }
    public final class PearSealed extends FruitSealed {
    }
    @Override
    public void runExample() {
        AppleSealed apple = new AppleSealed();
        PearSealed pear = new PearSealed();
        FruitSealed fruit = apple;
        class Avocado extends AppleSealed {}

        // not allowed
        // class Grape extends FruitSealed {}
    }
}
