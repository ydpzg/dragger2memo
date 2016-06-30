package com.dukelight.dragger2memo;

import com.dukelight.dragger2memo.container.Container;

/**
 * Created by YDP on 16/6/29.
 */

public class Test {
    public static void main(String[] args) {
        Container container = new Container();
        container.init();
        System.out.println(container.getF().toString());
        System.out.println(container.getApple().toString());
        System.out.println(container.getBanana().toString());
        System.out.println(container.getF2().toString());
    }
}
