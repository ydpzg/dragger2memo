package com.dukelight.dragger2memo.model;

/**
 * Created by YDP on 16/6/29.
 */

public class Fruit2 {
    protected int color;
    protected int size;

    public Fruit2(int color, int size) {
        this.color = color;
        this.size = size;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Fruit{" +
                "color=" + color +
                ", size=" + size +
                '}';
    }
}
