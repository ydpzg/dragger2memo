package com.dukelight.dragger2memo.component;

import com.dukelight.dragger2memo.container.Container;
import com.dukelight.dragger2memo.module.Fruit2Module;
import com.dukelight.dragger2memo.module.FruitModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by YDP on 16/6/29.
 */
@Singleton
@Component(modules = {FruitModule.class, Fruit2Module.class})
public interface FruitComponent {
    void inject(Container container);
}
