package com.dukelight.dragger2memo.component;

import com.dukelight.dragger2memo.model.Fruit;
import com.dukelight.dragger2memo.module.FruitModule;
import com.dukelight.dragger2memo.qualifier.IntNamed;

import javax.inject.Named;

import dagger.Component;

/**
 * Created by YDP on 16/6/29.
 */
@Component(modules = {FruitModule.class})
public interface FruitAComponent {
    Fruit fruits();
    @Named("apple2")
    Fruit fruits2();
    @IntNamed(floatValue = 12.1f, intValue = 1)
    Fruit fruits999();

//    void inject(Container container);
}
