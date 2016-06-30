package com.dukelight.dragger2memo.module;

import android.graphics.Color;

import com.dukelight.dragger2memo.model.Fruit2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by YDP on 16/6/29.
 */

@Module
public class Fruit2Module {
//    @Provides
//    public Fruit provideFruit(){
//        return new Apple(Color.RED, 6);
//    }

    @Provides
    public Fruit2 provideFruit3(){
        return new Fruit2(Color.BLUE, 8);
    }
//
//    @Named("apple2")
//    @Provides
//    public Fruit provideApple(int color){
//        return new Apple(color, 999);
//    }
//    @Provides
//    public int provideApple4(){
//        return Color.BLACK;
//    }

}
