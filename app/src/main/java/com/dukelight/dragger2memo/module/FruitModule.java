package com.dukelight.dragger2memo.module;

import android.graphics.Color;

import com.dukelight.dragger2memo.model.Apple;
import com.dukelight.dragger2memo.model.Fruit;
import com.dukelight.dragger2memo.qualifier.IntNamed;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by YDP on 16/6/29.
 */

@Module
public class FruitModule {
//    @Provides
//    public Fruit provideFruit(){
//        return new Apple(Color.RED, 6);
//    }

    @Named("apple2")
    @Provides
    public Fruit provideApple1111(int color) {
        return new Apple(color, 999);
    }

    @Named("apple")
    @Provides
    public Fruit provideApple(int color){
        return new Apple(color, 6);
    }

    @IntNamed(floatValue = 12.1f, intValue = 1)
    @Provides
    public Fruit provideBanana(int color){
        return new Apple(color, 10);
    }
    @Provides
    public Fruit provideFruit(int color){
        return new Apple(color, 6);
    }

    @Provides
    public int provideFruit2(){
        return Color.RED;
    }

}
