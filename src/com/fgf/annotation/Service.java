package com.fgf.annotation;

import java.lang.annotation.*;

/**
 * Create by fengguofei
 * Date: 2018/8/6
 * Time: 16:06
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Service {
    String value() default "";
}
