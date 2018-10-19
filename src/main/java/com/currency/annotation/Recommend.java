package com.currency.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 课程里用来标记线程安全的类或者写法
 * @author zhufeng
 *
 */
@Target(ElementType.TYPE) //修饰类
@Retention(RetentionPolicy.SOURCE)
public @interface Recommend {
	
	String value() default "";

}
