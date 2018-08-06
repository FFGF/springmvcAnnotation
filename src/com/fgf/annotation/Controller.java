package com.fgf.annotation;

import java.lang.annotation.*;

/**
 * Create by fengguofei
 * Date: 2018/8/6
 * Time: 16:02
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Controller {
    String value() default "";
}
