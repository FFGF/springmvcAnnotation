package com.fgf.annotation;

import java.lang.annotation.*;

/**
 * Create by fengguofei
 * Date: 2018/8/6
 * Time: 16:05
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestMapping {
    String value() default "";
}
