package com.fgf.annotation;

import java.lang.annotation.*;

/**
 * Create by fengguofei
 * Date: 2018/8/6
 * Time: 16:04
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Quatifier {
    String value() default "";
}
