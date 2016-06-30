package com.dukelight.dragger2memo.component;

/**
 * Created by YDP on 16/6/29.
 */

import com.dukelight.dragger2memo.container.Container;
import com.dukelight.dragger2memo.module.Fruit2Module;

import dagger.Component;

@Component(dependencies = {FruitAComponent.class}, modules = {Fruit2Module.class})
public interface FruitBComponent {

    void inject(Container container);
}