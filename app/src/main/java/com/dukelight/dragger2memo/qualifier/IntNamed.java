package com.dukelight.dragger2memo.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by YDP on 16/6/29.
 */

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface IntNamed {
    float floatValue();
    int intValue();
}
