package com.dukelight.dragger2memo.model;

/**
 * Created by YDP on 16/6/29.
 */

public class Apple extends Fruit {

    public Apple(int color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color=" + color +
                ", size=" + size +
                '}';
    }
}
