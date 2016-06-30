package com.dukelight.dragger2memo.container;

import com.dukelight.dragger2memo.component.DaggerFruitAComponent;
import com.dukelight.dragger2memo.component.DaggerFruitBComponent;
import com.dukelight.dragger2memo.model.Fruit;
import com.dukelight.dragger2memo.model.Fruit2;
import com.dukelight.dragger2memo.qualifier.IntNamed;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import dagger.Lazy;

/**
 * Created by YDP on 16/6/29.
 */

public class Container {
    @Inject
    Fruit f;
    @Inject
    Fruit2 f2;

    @Named("apple2")
    @Inject
    Fruit apple;

    @IntNamed(floatValue = 12.1f, intValue = 1)
    @Inject
    Fruit banana;

    @Inject
    Lazy<Fruit> lazyFruit;

    @Inject
    Provider<Fruit> providerFruit;

    public void init(){
        DaggerFruitBComponent.builder().fruitAComponent(DaggerFruitAComponent.create()).build().inject(this); //7 使用FruitComponent的实现类注入

    }

    public Fruit getF() {
        return f;
    }

    public void setF(Fruit f) {
        this.f = f;
    }

    public Fruit2 getF2() {
        return f2;
    }

    public void setF2(Fruit2 f2) {
        this.f2 = f2;
    }

    public Fruit getApple() {
        return apple;
    }

    public void setApple(Fruit apple) {
        this.apple = apple;
    }

    public Fruit getBanana() {
        return banana;
    }

    public void setBanana(Fruit banana) {
        this.banana = banana;
    }
}
